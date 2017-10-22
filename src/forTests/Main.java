package forTests;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Main {
	protected static WebDriver driver;
	protected static String baseUrl = "https://app.finance-controlling.net/login";
	//protected static String baseUrl = "https://prog-ci.finance-controlling.net/login";
	   
    @BeforeClass
    public static void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\Andrey\\eclipse-jee-luna-R-win32-x86_64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        ChromeDriver chromeDriver = new ChromeDriver(options);
        driver = new EventFiringWebDriver(chromeDriver);
        getDriver().get(baseUrl);
    }
    
    public static WebDriver getDriver(){
        return driver;
    }           
}
