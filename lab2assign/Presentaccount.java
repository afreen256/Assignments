package lab2assign;

public class Presentaccount extends Account {
	private int tradeLicenseNumber;
	private static final double MIN_BALANCE = 500;
	
	public class presentaccount{
		
	}
	
	public void getBalance() {
		System.out.println(getAccountBalance());
	}

	public void withDraw(double amount) {
		if((getAccountBalance() - amount) >= MIN_BALANCE ) {
			setAccountBalance(getAccountBalance() - amount);
		} else {
			System.out.println("Insufficient funds");
		}
	}
}