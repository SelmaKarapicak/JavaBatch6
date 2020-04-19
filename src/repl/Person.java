package repl;
//Create the a Person class with the following:

public class Person {
	
	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthDay;
	private int birthYear;
	private String ssn;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public static void main(String[] args) {
		
		Person p=new Person();
		p.setFirstName("John");
		p.setLastName("Doe");
		p.setBirthMonth(10);
		p.setBirthDay(25);
		p.setBirthYear(1900);
		p.setSsn("123-45-6789");
		
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(p.getBirthMonth()+"/"+p.getBirthDay()+"/"+p.getBirthYear());
		System.out.println(p.getSsn());
	}

}
