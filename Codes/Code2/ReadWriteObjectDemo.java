import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double salary;
	transient String password;
	String city;
	String country;
	Employee(int id , String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("Cons Call ");
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString(){
		return "Id "+id+" name "+name+" salary "+salary+" Password "+password+" City is "+city+" Country "+country;
	}
	
}
public class ReadWriteObjectDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee ram = new Employee(1001,"Ram",9999);
		ram.password="ram123";
		ram.city = "Delhi";
		ram.country = "India";
		ram.setSalary(ram.getSalary() + 1000);
		String path ="/Users/amit/Documents/files/emp.dat";
		FileOutputStream fs = new FileOutputStream(path);
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(ram);
		os.close();
		fs.close();
		System.out.println("Done...");
		
		
	}

}
