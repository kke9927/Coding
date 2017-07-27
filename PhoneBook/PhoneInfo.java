package phonebook;

class PhoneInfo {

	private String name;
	private String phoneNumber;
	private String birthday;
	
	
	public String getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	void showPhoneInfo()
	{
		System.out.println("Name :" + name + " Phone Number :" + phoneNumber + " birthday :" + birthday);
	}
}

