package com.syntax.class25;

public interface Bank {
	
	void haveCheckingAccount();
	void haveSavings();
}
interface Trustable {
	void trust ();
}
class Finance {
	public void financing () {
		System.out.println("financial transaction must happen");
	}
}
class BOA extends Finance implements Bank, Trustable {
	@Override
	public void haveCheckingAccount() {
		System.out.println("BOA has checking account");
	}
	@Override
	public void haveSavings() {
		System.out.println("BOA has savings account");
	}
	@Override
	public void trust() {
		System.out.println("you can trus BOA with your money ");
	}
}
class CapitalOne extends Finance implements Bank, Trustable  {
	@Override
	public void haveCheckingAccount() {
		System.out.println("Capital One  has checking account");
	}
	@Override
	public void haveSavings() {
		System.out.println("Capital One  has savings account");
	}
	@Override
	public void trust() {
		System.out.println("you can trus Capital One with your money ");
	}
}
class CapitalOneChild extends CapitalOne {
}


