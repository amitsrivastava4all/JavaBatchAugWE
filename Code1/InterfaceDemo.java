interface IPlayer{  // 100% Abstract
	void attack();  // public abstract void attack();
	void defense();
	void jump();
	void run();
	int MIN_JUMP = 10;
	int MAX_JUMP = 100;
	int DEFAULT_JUMP = 30;
}
interface IStarPlayer{
	int TIMELIMIT = 10; // public static final int TIMELIMIT = 10;
	void maxPowerForLimitedTime();
}
abstract class CommonPlayer implements IPlayer{
	@Override
	public void jump(){
		System.out.println("This is the Common way of jump for every player");
	}
}
class RedPlayer extends CommonPlayer{
	@Override
	public void attack(){
		
	}
	@Override
	public void defense(){
		
	}
	
	@Override
	public void run(){
		
	}
}
class YellowPlayer implements IPlayer, IStarPlayer{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	int time = 1;
	@Override
	public void maxPowerForLimitedTime() {
		if(time<TIMELIMIT){
			time++;
		}
		// TODO Auto-generated method stub
		
	}
	
}
class GreenPlayer implements IPlayer{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
