package Payment;

public abstract class Employee {
	private String number;
	private String name;
	private int pay;
	
	public Employee(String number, String name, int pay) {
		super();
		this.number = number;
		this.name = name;
		this.pay = pay;
	}
	
	public abstract double payment();

	@Override
	public String toString() {
		return number + " " + name;
	}

	public int getPay() {
		return pay;
	}
	
}
