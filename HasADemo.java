class Student
{
	Course course = new Course();  // Has - A RelationShip
}
class Course{
	
}
class Account{
	
}
class Customer{
	Order order = new Order();
	Account account = new Account();
}
class Order{
	Product p = new Product();
}
class Product{
	
}
public class HasADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
