package Page;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Expediasearch {
	WebDriver driver;
	By flight=By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span");
	By leave=By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div/div/div[1]/button");
	By from=By.xpath("//*[@id=\"location-field-leg1-origin\"]");
	By go=By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div/div/div[1]/button");
	By to=By.xpath("//*[@id=\"location-field-leg1-destination\"]");
	
	By traveler=By.xpath("//*[@id=\"adaptive-menu\"]/button");
	By adult=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]/span");
	By child=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[2]/div/button[2]/span");
	By childage=By.xpath("//*[@id=\"child-age-input-0-0\"]");
	By economy=By.xpath("//*[@id=\"preferred-class-input-trigger\"]");
	By done=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[3]/button");
	By firstclass=By.xpath("//*[@id=\"preferred-class-input\"]/div/div/a[4]");
	By searchbutton=By.xpath("//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button");
	By  depart=By.xpath("//*[@id=\"d1-btn\"]");
	By depmonth =By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2");
	By nextclick1=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]");
	By depdate=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr[3]/td[5]/button");
	By depdone=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button");
	By retrn=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button");
	By  retmonth=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2 ");
	By nextclick2=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/button[2]");
	By retdate=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr/td/button");
	By retdone=By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/button");
	
	public Expediasearch(WebDriver driver) {
		this.driver=driver;
	
	}
	public void flightclick()
	{
	driver.findElement(flight).click();
	}
	public void setvalues( String leaving ,String going)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(leave).click();
		WebElement wb= driver.findElement(from);
		wb.sendKeys(leaving);
		wb.sendKeys(Keys.ENTER);
		driver.findElement(go).click();
		WebElement be=driver.findElement(to);
		be.sendKeys(going);
		be.sendKeys(Keys.ENTER);
		
		}
	
public void travler()
{
	driver.findElement(traveler).click();
}
	public void adultsearch()
	{
		driver.findElement(adult).click();
	}
	public void childsearch()
	{
		driver.findElement(child).click();
	}
	public void childage(String age )
	{
		driver.findElement(childage).click();
		Select dropdown=new Select(driver.findElement(childage));
		dropdown.selectByVisibleText(age);
		driver.findElement(done).click();
		
	}
	public void economyselect()
	{
		driver.findElement(economy).click();
	WebElement firstcls=driver.findElement(firstclass);
	firstcls.click();
	
	}
	public void datepick(String month1 ,String date1)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(depart).click();
		while(true)
		{
			WebElement mon=driver.findElement(depmonth);
			String mont=mon.getText();
			if(mont.equals(mon))
			{
				System.out.println(mont);
				break;
			}
			else
			{
				driver.findElement(nextclick1).click();
			}
		}
		List<WebElement>alldate1=driver.findElements(depdate);
				
		for(WebElement dateelement:alldate1)
		{
			String date=dateelement.getAttribute("data-day");
			if( date.equals(date1))
			{
				dateelement.click();
				System.out.println("date select");
				
			}
		
		}
		
		driver.findElement(depdone).click();
	}
	public void date(String  month ,String date)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(retrn).click();
		while(true)
		{
			WebElement month2=driver.findElement(retmonth);
			String retmo=month2.getText();
			if(retmo.equals(month2))
			{
				System.out.println(retmo);
				break;
			}
			else
			{
				driver.findElement(nextclick2).click();
			}
			List<WebElement>alldate=driver.findElements(retdate);
	for(WebElement dateelement2:alldate)
	{
		String rtdate=dateelement2.getAttribute("data-day");
		if(retdate.equals(rtdate))
		{
			dateelement2.click();
			System.out.println("date selected");
		}
		
	}
	driver.findElement(retdone).click();
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
		
	     





	
		
	
		
	


