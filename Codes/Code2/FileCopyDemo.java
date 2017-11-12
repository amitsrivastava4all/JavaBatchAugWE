import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int EOF = -1;
		String sourcePath = "/Users/amit/Documents/songs/S.mp3";
		String targetPath = "/Users/amit/Documents/songs/S2.mp3";
		System.out.println("Copy Start....");
		FileInputStream fs = new FileInputStream(sourcePath);
		BufferedInputStream bs = new BufferedInputStream(fs);
		FileOutputStream fo = new FileOutputStream(targetPath,true);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		long startTime = System.currentTimeMillis();
		int singleByte = bs.read();
		while(singleByte!=EOF){
			bo.write(singleByte);
			singleByte = bs.read();
		}
		long endTime = System.currentTimeMillis();
		bs.close();
		bo.close();
		fs.close();
		fo.close();
		
		System.out.println("Copy Done.."+(endTime-startTime));

	}

}
