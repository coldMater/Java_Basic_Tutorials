package Payment;

import java.util.ArrayList;

public class payMain {

	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		
		emps.add(new TempEmployee("E001","������",5000,6));
		emps.add(new RegularEmployee("E002","Ȳ�ص�",3000,400));
		emps.add(new PartEmployee("E003","�ں���",5,10));
		emps.add(new PartEmployee("E004","�����",10,20));
		
		System.out.println("========= 9�� �ΰǺ� ���޳����� =========");
		
		for(int i = 0; i < emps.size(); i++) {
			printPay(emps.get(i));
		}
		
		System.out.println("9�� �ΰǺ� �Ѿ� : " + getMonthTotal(emps) + "����");
	}

	private static int getMonthTotal(ArrayList<Employee> emps) {
		int allpay = 0;
		for(int i = 0; i < emps.size(); i++) {
			allpay += emps.get(i).payment();
		}
		return allpay;
	}

	private static void printPay(Employee employee) {
		double pay = cut(employee.payment());
		//String str = String.format("%.2f", pay);
		System.out.println(employee + " : " + pay + "����");
	}

	private static double cut(double payment) {
		return ((int)(payment * 100))/100.0;
	}

}
