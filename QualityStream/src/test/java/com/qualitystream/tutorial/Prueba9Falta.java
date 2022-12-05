package com.qualitystream.tutorial;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

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
    	
    	
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	
    	}
    	
 

@After
   public void tearDown() {
	   driver.close();
   }
    
}

