/*
 * 1. Runnable Interface
 * 2. Thread class
 */

class Logic{
	static int amount = 15000;

	static void logic(){
		if(amount>=5000){
			System.out.println("Enter Thread is "+Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			amount = amount - 5000;
			System.out.println(amount+"   Trans Done for "+Thread.currentThread().getName());
	}
}
}
class Job implements Runnable { //extends Thread{ 
	int sum = 0;
	int start;
	int end;
	int amount = 15000;
	Logic log = new Logic();
	int j =1;
//	Job( int startPos, int endLimit){
//		start = startPos;
//		end =endLimit;
//	}
	public  void run(){
		System.out.println("Inside RUN "+Thread.currentThread().getName());
		System.out.println("BALANCE IS "+amount+" "+Thread.currentThread().getName());
		synchronized(Logic.class){
			Logic.logic();
		}
		//		synchronized(log){
//			log.logic();
//		}
		//		synchronized(this){
//		if(amount>=5000){
//			System.out.println("Enter Thread is "+Thread.currentThread().getName());
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			amount = amount - 5000;
//			System.out.println(amount+"   Trans Done for "+Thread.currentThread().getName());
//		}
//		}
//		for(int i = 1; i<=5; i++,j++){
//			//sum+=i;
//			System.out.println("J is "+j+"I is "+i+" "+Thread.currentThread().getName() );
//		}
		//System.out.println("SUm is "+sum+" "+Thread.currentThread().getName());
	}
}
public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Job job = new Job(1,10);
		Job job = new Job();
		Thread worker = new Thread(job,"ram");
		//Job job2 = new Job(11,20);
//		job.setName("ram");
//		job2.setName("shyam");
//		job.start();
//		job2.start();
		Thread worker2 = new Thread(job,"Shyam");
		worker.start();  // will call run
		worker2.start();
		

	}

}
