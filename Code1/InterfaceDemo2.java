class Module implements InterfaceForModule2{
	@Override
	public void show(){
		
	}
	@Override
	public void print(){
		
	}
	void h1(int x){
		
	}
	void h2(){
		
	}
}
class CoModule{
	
}
interface InterfaceForModule2{
	void show();
	void print(); 
}
class Module2{
	void call(){
		InterfaceForModule2 m = new Module();
		m.show();
		//m.h1();
		//m.h2();
		m.print();
	}
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
