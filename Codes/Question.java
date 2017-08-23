
public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {22,90,31, 40,100,99,375547};
		int sum = 0;
		int counter=0;
		for(int i :arr){
			sum = 0;
			while(i>0){
				int e  = i%10;
				sum += e;
				i  = i/10;
			}
			if(sum ==4){
				++counter;
			}
		}
		System.out.println("Counter is "+counter);

	}

}
