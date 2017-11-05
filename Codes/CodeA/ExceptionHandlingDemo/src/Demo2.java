import java.io.File;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10/0;
		String path = "/Users/amit/Documents111/JavaBatch330AugWE/JavaBatch330/ExceptionHandlingDemo/src/Demo3.java";
		File file = new File(path);
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("this path is wrong....");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
