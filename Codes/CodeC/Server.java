import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JTextArea;

public class Server {
	static final int PORT = 7001;
	static ServerSocket server ;
	static Scanner s = new Scanner(System.in);
	static Socket socket ;
	static DataInputStream in;
	static DataOutputStream out;
	
	static void init() throws UnknownHostException, IOException{
		server = new ServerSocket(PORT);
		
		System.out.println("Waiting for the client...");
		Socket socket = server.accept();
		System.out.println("Client JOIN...");
		
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
	}
	
	static void write(String message) throws IOException{
		
		
		out.writeUTF(message);
		
		}
	
	static void read(JTextArea textarea) throws IOException{
		while(true){
		String msg = in.readUTF();
		textarea.setText(textarea.getText() + "\n CLIENT SAID :: "+msg);
		//System.out.println("Server Said "+msg);
		}
		}
	
//	public static void main(String[] args) throws IOException {
//		init();
//		read();
//		write();
//		
//		
//		
//
//	}

}
