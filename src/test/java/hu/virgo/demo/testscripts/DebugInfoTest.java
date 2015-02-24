package hu.virgo.demo.testscripts;

import hu.virgo.selenium.framework.JUnitTestTemplate;

import org.junit.Test;
import org.openqa.selenium.By;

public class DebugInfoTest extends JUnitTestTemplate {

	/**
	 * Check the taget/selenium-results folder after running this test.
	 */
	@Test
	public void thisTestWillFail() {
		driver.get(context.sut.getBaseUrl());
		driver.findElement(By.cssSelector("nonexistent-selector"));
	}
}
