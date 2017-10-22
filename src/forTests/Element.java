package forTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import forTests.Main;

public class Element extends Main {
	protected By by;

    public Element(By by){
        this.by = by;
    }
    
    protected WebElement composeWebElement(By by){
		return getDriver().findElement(by);
    }
    
    public void Fail() {
		
	}
}
