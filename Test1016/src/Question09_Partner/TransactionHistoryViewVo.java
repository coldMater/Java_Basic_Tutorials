package Question09_Partner;

public class TransactionHistoryViewVo {
	private String sendName; //������ ���
	private String recevieName; //�޴»��
	private String tranactionDate; //�ŷ�����
	private int deposit; //�Ա�
	private int withdraw; //���
	private int code; //�ŷ������ڵ�
	
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
