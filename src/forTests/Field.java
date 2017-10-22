package forTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Field extends Element {

	public Field(By by) {
		super(by);
	}

	public void sendKeys(String text) {
		composeWebElement(by).sendKeys(text);
	}

	public Object getText() {
		return composeWebElement(by).getText();
	}

	public String getAttribute(String text) {
		return composeWebElement(by).getAttribute(text);
	}

	public void sendKeys(Keys clear) {
		composeWebElement(by).sendKeys(clear);
	}

	public void click() {
		composeWebElement(by).click();		
	}

	public boolean isDisplayed() {
		return composeWebElement(by).isDisplayed();
	}

	public boolean isEnabled() {
		return composeWebElement(by).isEnabled();
	}

	public boolean isSelected() {
		return composeWebElement(by).isSelected();
	}
	
}


