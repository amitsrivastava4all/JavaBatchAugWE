abstract class P1{
	int e;
	 P1(){
		e = 100;
		System.out.println("P1 Cons Call "+e);
	}
	P1(int w){
		this();
		System.out.println("P1 Param Call ");
		
	}
	
	private void show(){
		System.out.println(".this is show");
	}
	void display(){
		show();
	}
}
class C1 extends P1{
	C1(int x){ //super();
		super(100);
		System.out.println("C1 Cons Param Call");
		display();
	}
	/*C1(){
		//super();
		System.out.println("C1 Cons Call");
	}*/
}
public class AbstractWithConsChain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj = new C1(10);

	}

}
