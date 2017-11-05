
public class Flow {
	static void view(){
		System.out.println("View Call DB");
		try{
		db();
		System.out.println("Get the DB Result");
		System.out.println("Print the DB Result");
		}
		catch(ArithmeticException e){
			System.out.println("SOme Problem in DB COnnection , Try After Sometime...");
		}
		}
	static void db() throws ArithmeticException{
		System.out.println("Open Connection ");
		System.out.println("DO Query");
		try{
		int x = 100/0;
		System.out.println("Get result");
		}
		finally{
		System.out.println("DB Connection Close");
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		view();

	}

}
