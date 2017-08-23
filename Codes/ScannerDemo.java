import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		/*File file =new File("/Users/amit/Documents/TestWord.txt");
		Scanner scanner= new Scanner(file);
		//Scanner scanner = new Scanner("Hello-How-are-You");
		//scanner.useDelimiter("-");
		int count = 0;
		while(scanner.hasNext()){
			count++;
			String data = scanner.next();
			//System.out.print(data+" ");		
		}
		System.out.println("Count is "+count);
		scanner.close();
	*/
		//System e = new System();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = s.next();
		System.out.println("Name is "+name);
		System.out.println("Enter the Age");
		int age = s.nextInt();
		System.out.println("Age is "+age);
		System.out.println("Enter the City");
		s.nextLine();
		String city = s.nextLine();
		System.out.println("City "+city);
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the Country");
		String country = s2.next();
		System.out.println("Country "+country);
		s.close();
		s2.close();
	}

}
