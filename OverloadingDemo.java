import java.math.BigDecimal;
import java.util.LinkedList;

class OnlineShop
{
//	long search(double price){
//		return 0;
//	}
	
	double search(double price){
		return 0.0;
	}
	String search(String brand){
		return "";
	}
	void search(String brand, double price){
		
	}
void search(double price, String brand){
		
	}
}
class Child extends OnlineShop{
	void search(String brand, String type, double price){
		
	}
}
class TypePromotion{
	void show(Long x){
		System.out.println("Long...");
	}
//	void show(Integer x){
//		System.out.println("Integer");
//	}
//	void show(double x){
//		System.out.println("double");
//	}
//	void show(float x){
//		System.out.println("float");
//	}
//	void show(long x){
//		System.out.println("long");
//	}
	void show(byte x){
		System.out.println("byte");
	}
	void show(short x){
		System.out.println("short");
	}
//	void show(int x){
//		System.out.println("int");
//	}
}
public class OverloadingDemo {
public static void main(String[] args) {
		// Wrapper Class
	BigDecimal bd = new BigDecimal("100000065434434300");
	BigDecimal bd2 = new BigDecimal("20000645435435345");
	BigDecimal bd3 = bd.add(bd2);
	System.out.println(bd3);
	Integer a1 = 100;
	Integer b1 = 100;
	Integer cc = a1 + b1;  // Unboxing + Boxing = AutoBoxing
	/*Integer a1 = new Integer(100);
	Integer b = new Integer(100);
	int aa = a1.intValue();
	int bb = b.intValue();
	int cc = aa + bb;
	Integer dd = new Integer(cc);
	*/
	LinkedList<Integer> l = new LinkedList<>();
	int v = 100;
	l.add(new Integer(10));
		Integer e = 100;
		System.out.println(Integer.toHexString(120));
		System.out.println(Integer.toBinaryString(200));
		System.out.println(Integer.toOctalString(120));
		float ee = e.floatValue();
		byte eee = e.byteValue();
		System.out.println();
		
	
		byte a = 10;
		int b = a;
		
		a = (byte)b;
		System.out.println("****************************************");
		TypePromotion tp = new TypePromotion();
		tp.show(1);
		//OnlineShop os = new OnlineShop();
		//os.search(90.0);
		
	}

}
