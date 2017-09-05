

abstract class Account{
	int acno;
	String name;
	double balance;
	void withDraw(){
		System.out.println("Account WithDraw Call");
	}
	void deposit(){
		System.out.println("Account Deposit Call");
	}
	abstract void roi();
		
	
}
class FDAccount extends Account{
	@Override
	void withDraw(){
		System.out.println("FD WithDraw...");
	}
	void lockingPeriod(){
		System.out.println("LOcking Period...");
	}
	@Override
	void roi(){
		
	}
}
class CurrentAccount extends Account{

	@Override
	void roi() {
		// TODO Auto-generated method stub
		
	}
	
}
class SavingAccount extends Account{
	@Override
	void roi(){
		
	}
	@Override
	void withDraw(){
	System.out.println("SA WithDraw Call");	
	}
	void limit(){
		System.out.println("SA Limit");
	}
	/**
	 * updateVersionOfNoOfTrans
	 */
	@Deprecated
	void noOfTransaction(){
		System.out.println("SA Trans");
	}
	void updateVersionOfNoOfTrans(){
		
	}
}

class AccountCaller{
	void callMe(Account account){
		account.deposit();
		account.withDraw();
		if(account instanceof SavingAccount){
			SavingAccount sa= (SavingAccount) account; // downcasting
			sa.limit();
			sa.noOfTransaction();
		}
		if(account instanceof FDAccount){
			FDAccount fd = (FDAccount) account; 
			fd.lockingPeriod();
			 
		}
		System.out.println("******************************");
		
		//account.limit();
	}
}

public class ISADemo {

	public static void main(String[] args) {
		
		AccountCaller ac = new AccountCaller();
		ac.callMe(new SavingAccount());  //Account sa = new SavingAccount();
		ac.callMe(new CurrentAccount()); 
		ac.callMe(new FDAccount()); 
	//	Account a  = new Account();
		SavingAccount s = new SavingAccount();
		//ac.callMe(new FDAccount()); 
		
		// TODO Auto-generated method stub
		//Frame f = new Frame();
		//f.show();
/*		Account sa = new SavingAccount();
		//SavingAccount sa = new SavingAccount();
		sa.deposit();
		sa.withDraw();
		//sa.wi
		sa.limit();
		sa.noOfTransaction();
		
		CurrentAccount ca = new CurrentAccount();
		ca.deposit();
		ca.withDraw();
		
		FDAccount fa = new FDAccount();
		fa.deposit();
		fa.withDraw();
		fa.lockingPeriod();
		
		*/
		
		
	}

}
