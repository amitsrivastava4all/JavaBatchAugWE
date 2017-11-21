import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress inet  = InetAddress.getLocalHost();
		System.out.println(inet);
		System.out.println("Enter the Host Name");
		String hostName = new Scanner(System.in).nextLine();
		System.out.println("Host Name "+hostName);
		InetAddress array[] = InetAddress.getAllByName(hostName);
		for(InetAddress arr : array){
			System.out.println(arr);
		}
		
		

	}

}
