package com.syntax.class23;

public class WebDriver {
	
	public void open() {
		System.out.println("Opening browser");
	}

}
class FirefoxDriver extends WebDriver{
	
	public void open() {
		System.out.println("Open firefox browser");
	}
}
class ChromeDriver extends WebDriver {
	
	public void open() {
		System.out.println("Open Chrome browser");
	}
}
class InternetExplorerDriver extends WebDriver{
	
	public void open() {
		System.out.println("Open ie browser");
	}
}
