package com.syntax.class23;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer[] computers= {new Apple("Apple"), new Lenovo("Lenovo"),new HP("HP"),new Dell("Dell")};
		
		for(Computer c:computers) {
			c.keybord();
		}
		
		Apple c=new Apple("Apple");
		c.ios();
		
		Lenovo c1=new Lenovo("Lenovo");
		c1.hd();
		

	}

}
