import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadDemo {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/files/emp.dat";
		FileInputStream fs = new FileInputStream(path);
		ObjectInputStream os = new ObjectInputStream(fs);
		Employee emp  = (Employee)os.readObject();
		System.out.println(emp);  // emp.toString();
		os.close();
		fs.close();
		

	}

}
