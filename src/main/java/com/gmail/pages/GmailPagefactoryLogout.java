package com.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailPagefactoryLogout {

	WebDriver driver;

	public GmailPagefactoryLogout(WebDriver driver) {

		this.driver = driver;
		System.out.println("This driver is called");
	}

	@FindBy(xpath = "//span[@class='gb_8a gbii']")
	WebElement logOut;
	
	@FindBy(xpath="//a[text()='Sign out']")
	WebElement signOut;

}
