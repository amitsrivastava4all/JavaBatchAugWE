import java.util.Scanner;

class OutOfStockException extends Exception {
	private String message;
	OutOfStockException(){
		message = "Item not exist in the stock , try after sometime";
	}
	OutOfStockException(String message){
		this.message = message;
	}
	@Override
	public String toString(){
		return message;
	}
	
}

public class BusinessExeceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Quantity to Buy");
		int qt = new Scanner(System.in).nextInt();
		try{
		if(qt>4){
			throw new OutOfStockException();
		}
		System.out.println("Ask for Order Booking");
		System.out.println("Show Del Details and Order Details");
		System.out.println("Ask for Payment");
		}
		catch(OutOfStockException e){
			System.out.println(e);
			//System.out.println("Can't do Transaction , Stock is Out OfStock");
		}
		System.out.println("Thanks for Using this App");
	}

}
