package PhoneBook;

public class Phone {
	private String name;
	private String phoneNum;
	private String address;
	private int age;
	
	public Phone(String name, String phoneNum, String address, int age) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "�̸� : " + name + "\t ��ȣ : " + phoneNum + "\t �ּ� : " + address + "\t ���� : " + age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
