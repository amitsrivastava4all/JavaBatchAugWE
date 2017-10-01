import java.util.Date;
import java.util.Scanner;

class Order{
	private int id ;
	private String name;
	private Date date;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
class PersonalData
{
	private String firstName;
	private String lastName;
	private String city;
	private String phone;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

class View
{
	void ui(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstName = scanner.next();
		System.out.println("Enter the last name");
		String lastname = scanner.next();
		System.out.println("Enter the City");
		String city = scanner.next();
		System.out.println("Enter the phone");
		String phone = scanner.next();
		PersonalData pd = new PersonalData();
		pd.setFirstName(firstName);
		pd.setLastName(lastname);
		pd.setCity(city);
		pd.setPhone(phone);
		DB db = new DB();
		Order order = db.store(pd);  // Passing Ref
		System.out.println("Order Info "+order.getId()+" "+order.getName()+" "+order.getPrice()+" "+order.getDate());
	}
}
class DB
{
	Order store(PersonalData pd){
		System.out.println("Store in DB "+pd.getFirstName()+" "+pd.getLastName()+" "+pd.getCity()+" "+pd.getPhone());
		Order order = new Order();
		order.setId(10);
		order.setName("Apple X");
		order.setPrice(90000);
		order.setDate(new Date());
		return order;
	}
}
public class DataPassing {

	public static void main(String[] args) {
		

	}

}
