package forTests;

import org.openqa.selenium.By;

public class Label extends Element {

	public Label(By by) {
		super(by);
	}

	public String getText() {
		return composeWebElement(by).getText();
	}

	public void click() {
		composeWebElement(by).click();
		
	}

}
