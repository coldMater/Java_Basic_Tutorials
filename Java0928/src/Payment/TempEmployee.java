package Payment;

public class TempEmployee extends Employee {
	private int period;
	
	public TempEmployee(String number, String name, int pay, int period) {
		super(number, name, pay);
		this.period = period;
	}
	
	@Override
	public double payment() {
		return ((double)super.getPay() / period);
	}

}
