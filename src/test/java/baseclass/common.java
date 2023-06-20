package baseclass;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class common {

public	WebDriver driver;
	@BeforeClass
	public void search() {
		driver=new ChromeDriver() ;
	   driver.get("https://www.expedia.com/");
	   driver.manage().window().maximize();
	   
	  
	}
}
