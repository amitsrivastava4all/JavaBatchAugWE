import java.util.Scanner;

public class Scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the 3 numbers");
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int r = s.nextInt();
		int t = s.nextInt();
		System.out.println("Sum is "+(m+r+t));
	}

}
