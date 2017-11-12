import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Data to Write in a file....");
		String data = new Scanner(System.in).nextLine();
		String path = "/Users/amit/Documents/files/test.txt";
		FileOutputStream fs = null;
		try {
			fs =  new FileOutputStream(path,true);
			fs.write(data.getBytes());
			System.out.println("Done....");
		}
		catch(FileNotFoundException e){
			System.out.println("this path is invalid...");
		}
		catch (IOException e) {
			
			System.out.println("Some Permission Issues U Can't Write in a file...");
		}
		catch(Exception e){
			System.out.println("Some thing else Happens...");
		}
		finally{
			try {
				if(fs!=null){
				fs.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
