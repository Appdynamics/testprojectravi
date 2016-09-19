package com.dem1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test1
{
	@Test
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("Hi");
	}

}
