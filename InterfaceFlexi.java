import java.util.ArrayList;

@FunctionalInterface
interface Compute{
	int calculate(int x, int y);
	//public int add(int x, int y);
	
}

class MyCalc implements Compute{
	@Override
	public int calculate(int x, int y){
		return x + y;
	}
}
/*interface K
{
	void show();
	void print();
	default void disp(){
		
	}
}*/
/*class K1	 implements K{
	
}*/
@FunctionalInterface
interface A11
{
	public void show();
}
class Logic{
	static void evenOdd(int i){
		if(i%2==0){
			System.out.println("Even Number "+i);
		}
		else{
			System.out.println("Odd Number "+i);
		}
	}
}
class Parent{
	void show(){
		System.out.println("this is parent show...");
	}
	public void print(){
		System.out.println("Parent print...");
	}
}
public class InterfaceFlexi {

	public static void main(String[] args) {
		new Parent().show();
		Parent p = new Parent(){
			@Override
			void show(){
				super.show();
				super.print();
				this.output();
				System.out.println("this is child show");
			}
			void output(){
				System.out.println("this is child output");
			}
		};
		p.show();
		p.print();
		//p.output();
		
		// TODO Auto-generated method stub
		// Java 8 Lambda Expression
		//Runnable r;
		//ActionListener l ;
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(3);
		l.add(40);
		l.add(5);
		for(int i = 0; i<l.size(); i++){
			System.out.println(l.get(i));
		}
		for(int i: l){
			System.out.println(i);
		}
		//Logic logic = new Logic();
		//l.forEach(logic::evenOdd);
		l.forEach(Logic::evenOdd);
		/*l.forEach((i)->{
			if(i%2==0){
				System.out.println("Even Number "+i);
			}
			else{
				System.out.println("Odd Number "+i);
			}
		});*/
		
		A11 a1 = ()->System.out.println("I am Lambda Expression ");
		a1.show();
		Compute obj = (x,y)->x*y;
		System.out.println(obj.calculate(10, 2));
		Compute obj2 = (a,b)->{
			System.out.println("A is "+a+ " and B is "+b);
			return a-b;
		};
		System.out.println(obj2.calculate(10, 2));
		
		//MyCalc obj = new MyCalc();
		//System.out.println(obj.calculate(1001, 2000));
		/*Compute obj = new Compute(){
			@Override
			public int calculate(int x, int y){
				return x * y;
			}
		};
		System.out.println(obj.calculate(10, 2));
		if(10>2){
		Compute obj2 = new Compute(){
			@Override
			public int calculate(int x, int y){
				return x - y;
			}
		};
		System.out.println(obj2.calculate(10, 2));
		}*/
	}

}
