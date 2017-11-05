import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	static int firstNo;
	static int secondNo;
	static int result;
	static Scanner scanner= new Scanner(System.in);
	static void takeFirstNo(){
		try{
			System.out.println("Enter the First No");
			 firstNo = scanner.nextInt(); // throw new InputMisMatchException();
			}
			catch(InputMismatchException e){
				System.out.println("Only Number Allowed and u have enter something else");
				
				scanner.nextLine();
				takeFirstNo();
			}
	}
	
	static void takeSecondNo(){
		try{
			System.out.println("Enter the Second No");
			 secondNo = scanner.nextInt(); // throw new InputMisMatchException();
			}
			catch(InputMismatchException e){
				System.out.println("Only Number Allowed and u have enter something else");
				
				scanner.nextLine();
				takeSecondNo();
			}
	}
	
	static void divide(){
		try{
		 result= firstNo / secondNo;
		
		}
		catch(ArithmeticException e){
			System.out.println("U Divide a No with Zero , that's why this happens");
			takeSecondNo();
			divide();
		}
	}
	
	static void print(){
		System.out.println("Result is "+result);
	}
	
	
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		System.out.println((r.totalMemory()-r.freeMemory()));
		// TODO Auto-generated method stub
		try{
		takeFirstNo();
		takeSecondNo();
		divide();
		print();
		if(10>2){
			//return ;
			System.exit(0);
		}
		//System.out.println("Always RUN>>>>");
		}
		finally{
		scanner.close();
		System.out.println("Always RUN>>>>");
		}

	}

}
