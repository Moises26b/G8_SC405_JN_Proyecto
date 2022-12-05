package com.qualitystream.tutorial;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prueba10 {
	
	
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
    	
    	
    	WebElement Fb = driver.findElement(By.className("pull-left"));
    	Fb.click();
    	
    	WebElement email = driver.findElement(By.id("sb_forgot_email"));
    	email.sendKeys("Mooibca@gmail.com");
    	email.submit();
    	
    	
    	
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	}
 	
    
   @After
   public void tearDown() {
	   driver.close();
   }
    
}

