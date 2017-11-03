
public class ContactAddressMain {

	public static void main(String[] args) {
		ContactAddress contactAddress1 = new ContactAddress();
		contactAddress1.address = "광주광역시 동구";
		contactAddress1.email = "go@naver,com";
		contactAddress1.group = "친구";
		contactAddress1.name = "황해도";
		contactAddress1.phoneNumber = "01098848690";
		
		ContactAddress[] contactList = new ContactAddress[10];
		contactList[0] = contactAddress1;
		
		ContactAddress contactAddress = new ContactAddress("주소", "이메일","이름");
		ContactAddress contactAddress2 = new ContactAddress();
	}

}
