package repl;

public class Account {
	
	private long acc_no;
	private String name;
	private String email;
	private double amount;
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public static void main(String[] args) {
		
		Account ac=new Account();
		ac.setAcc_no(7560504000l);
		System.out.print(ac.getAcc_no());
		
		ac.setName(" Sumair ");
		System.out.print(ac.getName());
		
		ac.setEmail("sumair@syntax.com ");
		System.out.print(ac.getEmail());
		
		ac.setAmount(50000.0);
		System.out.print(ac.getAmount());
	}

}
