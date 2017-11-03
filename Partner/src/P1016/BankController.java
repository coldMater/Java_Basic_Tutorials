package P1016;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

import javax.sql.rowset.FilteredRowSet;

public class BankController {
	private int codeCount; // ���¹�ȣ�����ڵ�
	private Random rd = new Random(); // ������ ���¹�ȣ����
	private Scanner sc = new Scanner(System.in); // Ű���� �Է�
	private ArrayList<AccountVO> account = new ArrayList<AccountVO>();
	private ArrayList<TransactionHistoryViewVo> thv = new ArrayList<TransactionHistoryViewVo>();

	// ���»������
	public String accountCreation(String name, int password, int money) {
		int num1 = rd.nextInt(100) + 100;
		int num2 = rd.nextInt(100) + 100;
		int num3 = rd.nextInt(10000) + 100000;
		String accountNum = num1 + "-" + num2 + "-" + num3;

		int code = num1 + num2;
		account.add(new AccountVO(accountNum, name, password, money, code));

		return accountNum;
	}

	// �Աݱ��
	public String deposite(int money, String account, int password) {
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		String time = year +"�� " + mon + "�� " + day +"�� "+ hour + "�� " + min + "�� " + sec + "��";
		for (int i = 0; i < this.account.size(); i++) {
			if (this.account.get(i).getAccount().equals(account)) {
				thv.add(new TransactionHistoryViewVo(this.account.get(i).getName(), this.account.get(i).getName(), time,
						money, 0, this.account.get(i).getCode()));
				this.account.get(i).setMoney(this.account.get(i).getMoney() + money);
				codeCount = this.account.get(i).getCode();
			}
		}

		return "�Ա��� �Ϸ�Ǿ����ϴ�.";
	}

	// ��ݱ��
	public String withdraw(String account, int password, int money) {

		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		String time = year +"�� " + mon + "�� " + day +"�� "+ hour + "�� " + min + "�� " + sec + "��";
		for (int i = 0; i < this.account.size(); i++) {
			if (this.account.get(i).getAccount().equals(account)) {
				thv.add(new TransactionHistoryViewVo(this.account.get(i).getName(), this.account.get(i).getName(), time, 0, money, this.account.get(i).getCode()));
				this.account.get(i).setMoney(this.account.get(i).getMoney() - money);
				codeCount = this.account.get(i).getCode();
			}
		}
		return "����� �Ϸ�Ǿ����ϴ�.";
	}

	// ��ü���
	public String transfer(String account, int password) {
		System.out.print("�Աݰ��� : ");
		String depositeAccount = sc.next();
		System.out.print("��ü�ݾ� : ");
		int money = sc.nextInt();
		String depositeName = "";
		String withdraw = "";
		
		for (int i = 0; i < this.account.size(); i++) {
			if (this.account.get(i).getAccount().equals(depositeAccount)) {
				depositeName = this.account.get(i).getName();
			}
		}
		
		for (int i = 0; i < this.account.size(); i++) {
			if (this.account.get(i).getAccount().equals(account)) {
				if(this.account.get(i).getMoney() < money) {
					return "�� ����";
				}
				withdraw = this.account.get(i).getName();
			}
		}
		
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		String time = year +"�� " + mon + "�� " + day +"�� "+ hour + "�� " + min + "�� " + sec + "��";
		
		for (int i = 0; i < this.account.size(); i++) {
			if (this.account.get(i).getAccount().equals(account)) {
				thv.add(new TransactionHistoryViewVo(withdraw, depositeName, time, 0, money, this.account.get(i).getCode()));
				this.account.get(i).setMoney(this.account.get(i).getMoney() - money);
				codeCount = this.account.get(i).getCode();
			}
			if (this.account.get(i).getAccount().equals(depositeAccount)) {
				thv.add(new TransactionHistoryViewVo(depositeName, withdraw, time, money, 0, this.account.get(i).getCode()));
				this.account.get(i).setMoney(this.account.get(i).getMoney() + money);
			}
		}
		
		return "��ü�� �Ϸ�Ǿ����ϴ�.";
	}

	// �ŷ�������ȸ���
	public ArrayList<String> transactionHistoryView(String account, int password) {
		for (int i = 0; i < this.account.size(); i++) {
			if (this.account.get(i).getAccount().equals(account)) {
				codeCount = this.account.get(i).getCode();
			}
		}
		
		ArrayList<String> arrayString = new ArrayList<String>();
		ArrayList<TransactionHistoryViewVo> th = new ArrayList<TransactionHistoryViewVo>();
		th = this.getArrayListThVo();
		
		for (int i = 0; i < th.size(); i++) {
			String string = th.get(i).getSendName() + "\t\t" + th.get(i).getRecevieName() + "\t\t" + th.get(i).getTranactionDate() + "\t" + th.get(i).getDeposit() + "\t" + th.get(i).getWithdraw();
			arrayString.add(string);
		}
		return arrayString;
	}

	// ���ΰ������� ����Ʈ��ȯ���
	public ArrayList<AccountVO> getArrayListAccountVO() {
		ArrayList<AccountVO> aa = new ArrayList<>();
		for (int i = 0; i < account.size(); i++) {
			if (account.get(i).getCode() == codeCount) {
				aa.add(account.get(i));
			}
		}

		return aa;
	}

	// �ŷ��������� ����Ʈ��ȯ���
	public ArrayList<TransactionHistoryViewVo> getArrayListThVo() {
		ArrayList<TransactionHistoryViewVo> th = new ArrayList<TransactionHistoryViewVo>();
		
		for (int i = 0; i < thv.size(); i++) {
			if(thv.get(i).getCode() == codeCount) {
				th.add(thv.get(i));
			}
		}
		return th;
	}
}
