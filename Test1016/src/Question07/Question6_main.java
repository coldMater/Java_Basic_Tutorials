package Question07;

public class Question6_main {

	public static void main(String[] args) {
		Salary salary = new Salary("�Ƿη�", 1200000, 5, 4);
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("����� \t �⺻�� \t �ʰ��ٹ��ð� \t �ʰ��ٹ����� \t ������ \t �������� \t ���� \t �Ǽ��ɾ�");
		System.out.println("---------------------------------------------------------------------");
		System.out.print(salary.getName() + "\t" + salary.getGibonPay() + "\t" + salary.getOverWorkTime() + "\t \t" + salary.getOverTimeSalary() + " \t \t");
		System.out.println(salary.getFamilyNum() + "\t\t" + salary.getFamilySalary() + "\t\t" + salary.getTax() + "\t" + salary.getPay());
	}

}
