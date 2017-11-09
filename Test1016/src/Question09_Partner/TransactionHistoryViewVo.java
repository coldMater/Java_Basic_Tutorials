package Question09_Partner;

public class TransactionHistoryViewVo {
	private String sendName; //보내는 사람
	private String recevieName; //받는사람
	private String tranactionDate; //거래일자
	private int deposit; //입금
	private int withdraw; //출금
	private int code; //거래계좌코드
	
	public TransactionHistoryViewVo(String sendName, String recevieName, String tranactionDate, int deposit, int withdraw, int code) {
		this.sendName = sendName;
		this.recevieName = recevieName;
		this.tranactionDate = tranactionDate;
		this.deposit = deposit;
		this.withdraw = withdraw;
		this.code = code;
	}

	public String getSendName() {
		return sendName;
	}

	public String getRecevieName() {
		return recevieName;
	}

	public String getTranactionDate() {
		return tranactionDate;
	}

	public int getDeposit() {
		return deposit;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public int getCode() {
		return code;
	}
}
