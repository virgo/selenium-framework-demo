package hu.virgo.demo.testscripts;

import hu.virgo.demo.pages.ProblematicPage;
import hu.virgo.selenium.framework.JUnitTestTemplate;
import hu.virgo.selenium.framework.page.verify.PageVerificationException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PageObjectTest extends JUnitTestTemplate {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	/**
	 * Check the taget/selenium-results folder after running this test.
	 */
	@Test
	public void initPage() {
		driver.get(context.sut.getBaseUrl());
		exception.expect(PageVerificationException.class);
		utils.initPage(ProblematicPage.class);
	}

}
