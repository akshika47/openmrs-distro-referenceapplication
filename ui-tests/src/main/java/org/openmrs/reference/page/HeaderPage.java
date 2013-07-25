package org.openmrs.reference.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage extends AbstractBasePage {
	
	public HeaderPage(WebDriver driver) {
		super(driver);
	}
	
	static final String LOGOUT_HREF = OPENMRS_PATH + "/logout";
	static final String HOME_ICON = "icon-home small";
	static final String HOME_LINK_TEXT = "Home";
	
	// TODO This is unused, do we really need it?
	public void clickOnHomeIcon() {
		clickOn(By.id(HOME_ICON));
	}
	
	// TODO This is unused, do we really need it?
	public void clickOnHomeLink() {
		clickOn(By.linkText(HOME_LINK_TEXT));
	}
	
	public void logOut() {
		clickOnLinkFromHref(LOGOUT_HREF);
	}
	
	@Override
	public String expectedUrlPath() {
		return null;
	}
	
}
