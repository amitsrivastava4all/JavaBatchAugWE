
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Branch is "+Student.branch);
		
		int m[]= {90,70};
		Student ram = new Student(1001,"Ram",m,"Java");
		//ram.rollno=-1001;
		//ram.Student(10,20,40,50);
		ram.setName("Ramesh");
		ram.print();
		System.out.println("***************************************");
		//int m[]= {90,70};
		//ram.takeInput(1001, "Ram", m, "BCA");
		//ram.print();
		/*System.out.println(ram.rollno);
		System.out.println(ram.name);
		System.out.println(ram.marks);
		System.out.println(ram.course);
		System.out.println(ram.toString()+" "+ram);*/
		
		
		Student shyam = new Student(1002,"Shyam",m,"Java");
		//shyam.takeInput(1002, "Shyam", m, "BCA");
		shyam.print();
//		System.out.println(shyam);
//		System.out.println(shyam.rollno);
//		System.out.println(shyam.name);
		//long num = 150000;
		//System.out.println(Math.pow(2, 8));
		/*if(num>=Byte.MIN_VALUE && num<=Byte.MAX_VALUE){
			System.out.println("byte...");
		}
		if(num>=Short.MIN_VALUE && num<=Short.MAX_VALUE){
			System.out.println("short...");
		}
		if(num>=Integer.MIN_VALUE && num<=Integer.MAX_VALUE){
			System.out.println("int...");
		}*/
	}

}
