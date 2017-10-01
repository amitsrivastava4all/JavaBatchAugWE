import javax.swing.JFrame;

// Weaker Access Rule
// Covariant return type
class Y{
	
}
class X
{
	int  a, b,c;
}
class XPlus extends X
{
	int e,f;
}
class Parent1{
	void display(){
		System.out.println("this is print display");
	}
	@Deprecated
	/**
	 *  now print is not longer see #see Parent1.display()
	 */
	void print(){
		System.out.println("this is parent print");
	}
	//@Deprecated 
	X show(){
		System.out.println("this is parent show Call");
		X obj = new X();
		return obj;
	}
}
class Child1 extends Parent1
{
	
	@Override
	protected XPlus show(){
		System.out.println("this is child show call");
		return new XPlus();
	}
}
public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 obj = new Parent1();
		obj.print();
		JFrame f = new JFrame();
		f.setVisible(true);

	}

}
