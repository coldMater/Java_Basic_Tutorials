package Payment;

public class RegularEmployee extends Employee {
	private int bonus;

	public RegularEmployee(String number, String name, int pay, int bonus) {
		super(number, name, pay);
		this.bonus = bonus;
	}

	@Override
	public double payment() {
		return ((double)(super.getPay() + bonus)) / 12;
	}

}
