
public class ContactAddressMain {

	public static void main(String[] args) {
		ContactAddress contactAddress1 = new ContactAddress();
		contactAddress1.address = "���ֱ����� ����";
		contactAddress1.email = "go@naver,com";
		contactAddress1.group = "ģ��";
		contactAddress1.name = "Ȳ�ص�";
		contactAddress1.phoneNumber = "01098848690";
		
		ContactAddress[] contactList = new ContactAddress[10];
		contactList[0] = contactAddress1;
		
		ContactAddress contactAddress = new ContactAddress("�ּ�", "�̸���","�̸�");
		ContactAddress contactAddress2 = new ContactAddress();
	}

}
