package hu.virgo.demo.pages;

import hu.virgo.selenium.framework.page.Page;
import hu.virgo.selenium.framework.page.verify.ElementVerifier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProblematicPage extends Page {

	public ProblematicPage(WebDriver driver) {
		super(driver, new ElementVerifier(By.cssSelector("no such thing"), 2));
	}
	
	

}
