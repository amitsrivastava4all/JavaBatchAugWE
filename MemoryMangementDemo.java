import java.util.ArrayList;

class Employee{
	int id;  //4 
	String name;
	double salary;
	String city;
	Employee(int id , String name, double salary, String city){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}
}
public class MemoryMangementDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Start.....");
		ArrayList l = new ArrayList();
		while(true){
			Employee ram = new Employee(1001, "Ram",9999, "Delhi");
			//ram = null;
			l.add(ram);
			Thread.sleep(30);
		}
		// TODO Auto-generated method stub
		//System.out.println("Hello Java");
		//main(null);

	}

}
