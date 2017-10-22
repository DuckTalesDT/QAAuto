package forTests;

import org.openqa.selenium.By;
import forTests.Element;

public class Button extends Element {
	
	public Button(By by) {
		super(by);
	}

	public void click() {
		composeWebElement(by).click();
	}
		
	public Object getText() {
		return composeWebElement(by).getText();
	}
	
	public Object getAttribute(String text) {
		return composeWebElement(by).getAttribute(text);
	}	

	public boolean isEnabled() {
		return composeWebElement(by).isEnabled();
	}

	public boolean isSelected() {
		return composeWebElement(by).isSelected();
	}
	
	public boolean isDisplayed() {
		return composeWebElement(by).isDisplayed();
	}

	public void perform() {
	}

}
