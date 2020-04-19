package com.syntax.class25;

public class TestWebDriver {

	public static void main(String[] args) {
		
		WebDriver[] web={new ChromeDriver(),new FirefoxDriver()};	
		
		for(WebDriver w:web) {
			w.closeBrowser();
			w.findElement();
			w.maximizeWindow();
			w.openBrowser();
			System.out.println("=======");
		}
		
	}
}
