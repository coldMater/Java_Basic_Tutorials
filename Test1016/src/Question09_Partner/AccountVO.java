package Question09_Partner;

public class AccountVO {
	private String account; //���¹�ȣ
	private String name; //�̸�
	private int password; //��й�ȣ
	private int money; //�ݾ�
	private int code; //�ŷ������ڵ�
	
	public AccountVO(String account, String name, int password, int money, int code) {
		this.account = account;
		this.name = name;
		this.password = password;
		this.money = money;
		this.code = code;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getCode() {
		return code;
	}
}
