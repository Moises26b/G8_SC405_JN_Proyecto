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

public class Prueba9 {
	
	
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
    	
    	WebElement email = driver.findElement(By.id("email"));
    	email.sendKeys("Mooibca@gmail.com");
    	email.submit();
    	WebElement pass = driver.findElement(By.id("pass"));
    	pass.sendKeys("MOI12345");
    	
    	pass.submit();
    	/*WebElement List = driver.findElement(By.className("select2-results__option"));
    	
    	List.click();
    	
    	Lista.submit();*/
    	
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	
    }
   @After
   public void tearDown() {
	   //driver.quit();
   }
    
}

