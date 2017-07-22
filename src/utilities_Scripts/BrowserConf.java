package utilities_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class BrowserConf {
	static String chromeDriver_Path = "./chromedriver.exe";
	static String iEDriver_Path = "./IEDriverServer.exe";
	static String geckoDriver_Path = "./geckodriver.exc";
	static WebDriver driver = null;
	
	public static WebDriver browser(String browser){
		
		System.out.println("BrowserLaunch :"+ browser);
		if (browser.equalsIgnoreCase("firefox") ){
			System.setProperty("webdriver.firefox.driver",  geckoDriver_Path);
			driver = new FirefoxDriver(); 
		}else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrom.driver", chromeDriver_Path);
			driver = new ChromeDriver();			
		}else if(browser.equalsIgnoreCase("internetExplorer")){
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			driver = new InternetExplorerDriver();
		}		
		return driver;		
	}

}
