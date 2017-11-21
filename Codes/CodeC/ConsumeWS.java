import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import com.google.gson.Gson;

public class ConsumeWS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Enter the Host Name");
		String hostName = new Scanner(System.in).nextLine();
		
		URL url = new URL("http://freegeoip.net/json/"+hostName);
		URLConnection connection = url.openConnection();
		connection.connect();
		InputStream is = connection.getInputStream();
		int singleByte = is.read();
		StringBuffer sb = new StringBuffer();
		while(singleByte != -1 ){
			sb.append((char)singleByte);
			singleByte = is.read();
		}
		is.close();
		Gson gson = new Gson();
		Data data = gson.fromJson(sb.toString(), Data.class);
		System.out.println("IP is "+data.ip);
		System.out.println("Country is "+data.country_name);
		System.out.println("Long is "+data.longitude);
		System.out.println("Lat is "+data.latitude);
		//System.out.println(" JSON is "+sb.toString());
		
	}

}
