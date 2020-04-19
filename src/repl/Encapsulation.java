package repl;

public class Encapsulation {
	
	private String empName;
	private int empAge;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setEmpName("Mario");
		System.out.println("Employee name "+e.getEmpName());
		
		e.setEmpAge(32);
		System.out.println("Employee age "+e.getEmpAge());
	}

}
