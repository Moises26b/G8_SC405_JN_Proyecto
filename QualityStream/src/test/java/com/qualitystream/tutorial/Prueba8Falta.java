package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.Event;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Prueba8Falta {

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
		
		int elementPosition = Event.getLocation().getY();
		String js = String.format("window.scroll(10, %s)", elementPosition-90);
		((JavascriptExecutor)driver).executeScript(js);

		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();

		

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@After
	public void tearDown() {
		// driver.quit();
	}

}
