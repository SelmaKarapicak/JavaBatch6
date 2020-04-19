package com.syntax.class25;

public interface WebDriver {
	
	public void openBrowser();
	
	public void closeBrowser();
	public void maximizeWindow();
	public void findElement();
}

class ChromeDriver implements WebDriver{

	@Override
	public void openBrowser() {
		System.out.println("Open by ChromeDriver");
	}

	@Override
	public void closeBrowser() {
		System.out.println("close by ChromeDriver");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("maximizewindow by ChromeDriver");
	}

	@Override
	public void findElement() {
		System.out.println("find elements by ChromeDriver");
	}
}
	class FirefoxDriver implements WebDriver{

		@Override
		public void openBrowser() {
			System.out.println("Open by Firefox");
		}

		@Override
		public void closeBrowser() {
			System.out.println("close by Firefox");
		}

		@Override
		public void maximizeWindow() {
			System.out.println("maximize window by Firefox");
		}

		@Override
		public void findElement() {
			System.out.println("find element by Firefox");
		}
	
	}

