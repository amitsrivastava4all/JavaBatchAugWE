class Emp{
	Dept dept ;
	static Emp e;
	int x = 100;
	Emp(Dept dept){
		x++;
		System.out.println("Emp Cons Call");
		 //dept = new Dept();
	this.dept = dept;
	}
	@Override
	protected void finalize(){
		e = this;
		System.out.println("Emp Saying Gud Bye..."+this);
	}
}
class Dept
{
	Dept(){
		System.out.println("Dept Cons Call");
	}
	@Override
	protected void finalize(){
		System.out.println("Dept Saying Gud Bye..."+this);
	}
}
public class CompAgg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept dept = new Dept();
		Emp emp = new Emp(dept);
		emp = null;
		System.gc();
		
		
		for(int i = 1; i<=10; i++){
			System.out.println("I is "+i);
		}
		
		System.out.println("Emp Is "+Emp.e);
	    emp = Emp.e;
	    System.out.println(emp.x);
	}

}
