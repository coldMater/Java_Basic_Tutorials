package Phone;

public class PhoneMain {

	public static void main(String[] args) {
		CellPhone cellPhone = new CellPhone();
		cellPhone.makeCall();
		cellPhone.takeCall();
		
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.makeCall();
		smartPhone.takeCall();
		smartPhone.playMusic();
		smartPhone.surpingInternet();
	}

}
