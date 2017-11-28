
public class Demo1 {

	static void show(){
			for(int i = 1; i<=3; i++){
				System.out.println("I is show :: "+i);
			}
	}
	static void disp(){
		for(int i = 1; i<=3; i++){
			System.out.println("I is disp :: "+i);
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String threadName = Thread.currentThread().getName();
		System.out.println("Thread Name is "+threadName);
		show();
		disp();

	}

}
