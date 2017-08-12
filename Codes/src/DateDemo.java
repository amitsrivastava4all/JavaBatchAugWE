import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int x;
		System.out.println("स्वागत हे");
		Locale locale = new Locale("hi","IN");
		// messages_hi_IN.properties
		ResourceBundle rb = ResourceBundle.getBundle("messages",locale);
		System.out.println(rb.getString("welcomemsg"));
		//System.out.println("Welcome to this Application");
		double salary = 100000;
		Date d = new Date();
		//System.out.println(d);
		
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL,locale);
		String result = df.format(d);
		System.out.println(result);
		//DateFormat df2 = DateFormat.getDateInstance();
		System.out.println(rb.getString("salarymsg")+salary);
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String result2 = nf.format(salary);
		System.out.println(rb.getString("resultmsg")+result2);
	}

}
