package newpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class MyClass {
	 private static NgWebDriver ngDriver;
	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "/Users/prajakta/Downloads/geckodriver");;
		WebDriver driver = new FirefoxDriver();
                driver.get("http://juliemr.github.io/protractor-demo/");
		 ngDriver = new NgWebDriver((JavascriptExecutor) driver);
		 ngDriver.waitForAngularRequestsToFinish();
               driver.findElement(ByAngular.model("first")).sendKeys("2");
                
                driver.findElement(By.xpath("//form[@class ='form-inline ng-pristine ng-valid']/input")).sendKeys("2");
                
                driver.findElement(ByAngular.model("second")).sendKeys("2");
              
               driver.findElement(ByAngular.buttonText("Go!")).click();
        }

}
