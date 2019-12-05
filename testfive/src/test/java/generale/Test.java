package generale;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

public class Test {
	 public static String browserName=null;
	WebDriver driver=null; 

	@BeforeTest
	private void setup() {
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		Prop.choisissezVotreNavigateur("chrome");
		Prop.getprop();
	
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", projectPath+"\\drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}

	}
	@org.testng.annotations.Test
	public void google() {
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("amazon.fr");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
