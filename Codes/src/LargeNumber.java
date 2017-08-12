import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


public class LargeNumber {

	public static void main(String[] args) {
		
		BigDecimal bg = new BigDecimal("10000000.20");
		BigDecimal bg2 = new BigDecimal("200000000.90");
		BigDecimal bg3 = bg.add(bg2);
		System.out.println(bg3);
		BigInteger bb = new BigInteger("123456789");
		
	}

}
