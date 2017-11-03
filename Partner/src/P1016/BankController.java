package P1016;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

import javax.sql.rowset.FilteredRowSet;

public class BankController {
	private int codeCount; // 계좌번호생성코드
	private Random rd = new Random(); // 난수로 계좌번호생성
	private Scanner sc = new Scanner(System.in); // 키보드 입력
	private ArrayList<AccountVO> account = new ArrayList<AccountVO>();
	private ArrayList<TransactionHistoryViewVo> thv = new ArrayList<TransactionHistoryViewVo>();

	// 계좌생성기능
	public String accountCreation(String name, int password, int money) {
		int num1 = rd.nextInt(100) + 100;
		int num2 = rd.nextInt(100) + 100;
		int num3 = rd.nextInt(10000) + 100000;
		String accountNum = num1 + "-" + num2 + "-" + num3;

		int code = num1 + num2;
		account.add(new AccountVO(accountNum, name, password, money, code));

		return accountNum;
	}

	// 입금기능
	public String deposite(int money, String account, int password) {
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		String time = year +"년 " + mon + "월 " + day +"일 "+ hour + "시 " + min + "분 " + sec + "초";
		for (int i = 0; i < this.account.size(); i++) {
			if (this.account.get(i).getAccount().equals(account)) {
				thv.add(new TransactionHistoryViewVo(this.account.get(i).getName(), this.account.get(i).getName(), time,
						money, 0, this.account.get(i).getCode()));
				this.account.get(i).setMoney(this.account.get(i).getMoney() + money);
				codeCount = this.account.get(i).getCode();
			}
		}

		return "입금이 완료되었습니다.";
	}

	// 출금기능
	public String withdraw(String account, int password, int money) {

		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);

		String time = year +"년 " + mon + "월 " + day +"일 "+ hour + "시 " + min + "분 " + sec + "초";
		for (int i = 0; i < this.account.size(); i++) {
			if (this.account.get(i).getAccount().equals(account)) {
				thv.add(new TransactionHistoryViewVo(this.account.get(i).getName(), this.account.get(i).getName(), time, 0, money, this.account.get(i).getCode()));
				this.account.get(i).setMoney(this.account.get(i).getMoney() - money);
				codeCount = this.account.get(i).getCode();
			}
		}
		return "출금이 완료되었습니다.";
	}

	// 이체기능
	public String transfer(String account, int password) {
		System.out.print("입금계좌 : ");
		String depositeAccount = sc.next();
		System.out.print("이체금액 : ");
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
					return "돈 없어";
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

		String time = year +"년 " + mon + "월 " + day +"일 "+ hour + "시 " + min + "분 " + sec + "초";
		
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
		
		return "이체가 완료되었습니다.";
	}

	// 거래내역조회기능
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

	// 개인계좌정보 리스트반환기능
	public ArrayList<AccountVO> getArrayListAccountVO() {
		ArrayList<AccountVO> aa = new ArrayList<>();
		for (int i = 0; i < account.size(); i++) {
			if (account.get(i).getCode() == codeCount) {
				aa.add(account.get(i));
			}
		}

		return aa;
	}

	// 거래내역정보 리스트반환기능
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
