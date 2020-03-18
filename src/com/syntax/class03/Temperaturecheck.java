package com.syntax.class03;

public class Temperaturecheck {

	public static void main(String[] args) {
		
		int temperature=75;
		
		if(temperature<32) {
			System.out.println("Water will freeze with temperature " + temperature);
		}

		else  {
			System.out.println("Water will not freeze temperature " + temperature);
		}
	}

}
