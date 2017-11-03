package Payment;

import java.util.ArrayList;

public class payMain {

	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<Employee>();
		
		emps.add(new TempEmployee("E001","이은비",5000,6));
		emps.add(new RegularEmployee("E002","황해도",3000,400));
		emps.add(new PartEmployee("E003","박병관",5,10));
		emps.add(new PartEmployee("E004","김미희",10,20));
		
		System.out.println("========= 9월 인건비 지급내역서 =========");
		
		for(int i = 0; i < emps.size(); i++) {
			printPay(emps.get(i));
		}
		
		System.out.println("9월 인건비 총액 : " + getMonthTotal(emps) + "만원");
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
		System.out.println(employee + " : " + pay + "만원");
	}

	private static double cut(double payment) {
		return ((int)(payment * 100))/100.0;
	}

}
