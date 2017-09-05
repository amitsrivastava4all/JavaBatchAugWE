//final class Parent
class Parent
{
	int a,b,c;
	public final int X  = 100;
	final void show(){
		
	}
	void print(){
		
	}
}
class Child extends Parent{
	
}
public class FinalDemo {

	public static void main(String[] args) {
		Math.pow(2, 3);
		System.out.println();
		// TODO Auto-generated method stub
		Parent obj2 = new Parent();
		obj2 = new Parent();
		final Parent OBJ = new Parent();
		OBJ.a= 100;
		OBJ.a++;
		
		//obj = new Parent();
		
		int b = 200;
		final int DEFAULT_POWER = 10;
		final int MAX_POWER = 100;
		int power= DEFAULT_POWER;
		if(power<MAX_POWER){
			power++;
		}
		//MAX++;

	}

}
