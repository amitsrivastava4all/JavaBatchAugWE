import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int EOF = -1;
		String path = "/Users/amit/Documents/JavaBatch330AugWE/JavaBatch330/FileHandlingDemo/src/FileReadDemo.java";
		File file = new File(path);
		if(!file.exists()){
			System.out.println("File Not Exist Can't Read it ....");
			return ;
		}
		FileInputStream fs = new FileInputStream(file);
		int singleByte = fs.read();
		while(singleByte!=EOF){
			System.out.print((char)singleByte);
			singleByte = fs.read();
		}
		fs.close();
		
	}

}
