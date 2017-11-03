package Payment;

public class PartEmployee extends Employee {
	private int day;
	
	public PartEmployee(String number, String name, int pay, int day) {
		super(number, name, pay);
		this.day = day;
	}

	@Override
	public double payment() {
		return (super.getPay() * day);
	}

}
