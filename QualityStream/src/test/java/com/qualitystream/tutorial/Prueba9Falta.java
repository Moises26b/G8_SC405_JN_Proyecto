package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Prueba9Falta {
	
	
    private WebDriver driver;
    
    @Before
    public void setUp() {

    	System.setProperty("WebDriver.gecko.driver", "./src/test/resources/DriverJava/geckodriver.exe");
    	driver = new FirefoxDriver();
    	driver.manage().window().maximize();
    	driver.get("https://sistemas.ufidelitas.ac.cr/nokri-demo2/");
    	
    }
   @Test
    public void testFirefoxPage() {
    	WebElement Login = driver.findElement(By.className("n-login-header"));
    	Login.click();
    	
    	
    	WebElement Fb = driver.findElement(By.className("a2a_button_facebook"));
    	Fb.click();
    	//driver.switchTo().window("Facebook");
    	//String winHandleBefore = driver.getWindowHandle();

    	// Perform the click operation that opens new window

    	// Switch to new window opened
    	//for(String winHandle : driver.getWindowHandles()){
    	   // driver..window("Facebook");
    	//WebElement face = driver.findElement(By.className("a2a_svg a2a_s__default a2a_s_facebook"));
    	
    	//driver.get("https://www.addtoany.com/add_to/facebook?linkurl=https%3A%2F%2Fsistemas.ufidelitas.ac.cr%2Fnokri-demo2%2Fsignin%2F&linkname=Signin&linknote=");
    	WebElement email = driver.findElement(By.partialLinkText("email"));
    	email.sendKeys("Mooibca@gmail.com");
    	email.submit();
    	WebElement pass = driver.findElement(By.id("pass"));
    	pass.sendKeys("MOI12345");
    	
    	// Switch back to original browser (first window)
    	//driver.switchTo().window(winHandleBefore); 
    	
    	pass.submit();
    	/*WebElement List = driver.findElement(By.className("select2-results__option"));
    	
    	List.click();
    	
    	Lista.submit();*/
    	
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	}
    	
    
   @After
   public void tearDown() {
	   //driver.close();
   }
    
}

