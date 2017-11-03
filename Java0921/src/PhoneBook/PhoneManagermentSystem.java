package PhoneBook;

import java.util.ArrayList;

public class PhoneManagermentSystem {
	private ArrayList<Phone> phone = new ArrayList<Phone>();

	public ArrayList<Phone> getPhone() {
		return phone;
	}

	public void addPhoneList(String name, String number, String address, int age) {
		Phone ph = new Phone(name, number, address, age);
		phone.add(ph);
	}

	public void setPhoneList(String name, String number, String address, int age, int index) {
		Phone ph = new Phone(name, number, address, age);
		phone.set(index, ph);
	}

	public void removePhoneList(int i) {
		phone.remove(i);
	}
	
}
