package Question07;

public class Question6_main {

	public static void main(String[] args) {
		Salary salary = new Salary("뽀로로", 1200000, 5, 4);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("사원명 \t 기본급 \t 초과근무시간 \t 초과근무수당 \t 가족수 \t 가족수당 \t 세금 \t 실수령액");
		System.out.println("---------------------------------------------------------------------");
		System.out.print(salary.getName() + "\t" + salary.getGibonPay() + "\t" + salary.getOverWorkTime() + "\t \t" + salary.getOverTimeSalary() + " \t \t");
		System.out.println(salary.getFamilyNum() + "\t\t" + salary.getFamilySalary() + "\t\t" + salary.getTax() + "\t" + salary.getPay());
	}

}
