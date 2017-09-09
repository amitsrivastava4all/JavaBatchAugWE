interface T1
{
	void print();
	void show(int x);
	public default void display(){
		System.out.println("T1 display...");
	}
}
interface T2{
	void show();
	void print();
	public default void display(){
		System.out.println("T2 display...");
	}
}
interface T3 extends T1,T2{
	void output();
	public default void display(){
		T1.super.display();
		T2.super.display();
		System.out.println("this is t3...");
	}
}
interface T6 extends T3{
	public default void display(){
		T3.super.display();
		System.out.println("This is T6....");
	}
}
class T5{
	
}
class T4 extends T5 implements T3, T6{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show(int x) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T4 obj = new T4();
		obj.display();

	}

}
