package Question07;

public class Salary {
	private String name;
	private int gibonPay;
	private int overWorkTime;
	private int familyNum;
	
	public Salary(String name, int gibonPay, int overWorkTime, int familyNum) {
		this.name = name;
		this.gibonPay = gibonPay;
		this.overWorkTime = overWorkTime;
		this.familyNum = familyNum;
	}

	public String getName() {
		return name;
	}

	public int getGibonPay() {
		return gibonPay;
	}

	public int getOverWorkTime() {
		return overWorkTime;
	}

	public int getFamilyNum() {
		return familyNum;
	}
	
	public int getOverTimeSalary() {
		return overWorkTime * 10000;
	}
	
	public int getFamilySalary() {
		if(familyNum > 3) {
			return 300000;
		} else {
			return 200000;
		}
	}
	
	public int getTax() {
		return (int) (gibonPay * 0.03);
	}
	
	public int getPay() {
		return gibonPay + this.getOverTimeSalary() + this.getFamilySalary() - this.getTax();
	}
}
