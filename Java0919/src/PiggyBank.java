
public class PiggyBank {
	private int money;
	
	public void deposit(int input) {
		money += input;
	}
	
	public void withdraw(int output) {
		money -= output;
	}
	
	public int showMoney() {
		return money;
	}
}
