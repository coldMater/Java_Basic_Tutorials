package DAO;

public class Member {
	private String name;
	private String phoneNum;
	private int age;
	
	public Member(String name, String phoneNum, int age) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
