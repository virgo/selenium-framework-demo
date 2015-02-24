package hu.virgo.demo.pages;

import hu.virgo.selenium.framework.page.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProblematicPage extends Page {

	public ProblematicPage(WebDriver driver) {
		super(driver, By.id("foobar"));
	}

}
