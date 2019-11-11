package newpackage;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class MyClass {
	 private static NgWebDriver ngDriver;
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "/Users/prajakta/Downloads/geckodriver");;
		WebDriver driver = new FirefoxDriver();
                driver.get("http://andipavllo.github.io/Google-Maps-Onsen-UI-Sample/www/index.html");
		 ngDriver = new NgWebDriver((JavascriptExecutor) driver);
		 ngDriver.waitForAngularRequestsToFinish();
//               driver.findElement(ByAngular.model("first")).sendKeys("2");
//                
//                driver.findElement(By.xpath("//form[@class ='form-inline ng-pristine ng-valid']/input")).sendKeys("2");
//                
//                driver.findElement(ByAngular.model("second")).sendKeys("2");
//              
//               driver.findElement(ByAngular.buttonText("Go!")).click();
		 
		WebElement marker1 =  driver.findElement(By.xpath("//span[@class='label ons-button-inner']/span"));
		
		Point pt = marker1.getLocation();
		 
		int NumberX=pt.getX();
		int NumberY=pt.getY();
		
		System.out.println(NumberX);
		System.out.println(NumberY);
		
		Actions ac = new Actions(driver);
		
	//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", marker1);
		
//	ac.moveToElement(marker1).moveByOffset(-200,-300).clickAndHold().build().perform();
	
	ac.moveToElement(marker1, 0, 0).moveByOffset(-200,-200).clickAndHold().build().perform();
   
	Thread.sleep(9000);
	 ngDriver.waitForAngularRequestsToFinish();
	
	WebElement marker2 = driver.findElement(By.xpath("//div[@class='gm-style']/div/div[3]/div/div/div/img[@src='https://maps.gstatic.com/mapfiles/api-3/images/spotlight-poi2_hdpi.png']"));
	
//	ngDriver.waitForAngularRequestsToFinish();
		 
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", marker2);
	
	
	if(marker2.isEnabled()) {
		
		marker2.click();
	}else {
		
		System.out.println("Not available");
	}
//   Alert alert;
//	   alert=driver.switchTo().alert();
//	   alert.accept();
//	   
//	   
	   
	  // Thread.sleep(9000);
		
	
        }

	
}
