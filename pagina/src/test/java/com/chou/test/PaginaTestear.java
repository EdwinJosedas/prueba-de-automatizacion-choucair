package com.chou.test;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class PaginaTestear {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\fabia\\OneDrive - ucentral.edu.co\\Documentos\\javavirtual\\eclipseNeon\\WORKSPACESELENIUM\\chromedriver_win32\\chromedriver.exe");
		WebDriver  driver;
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Now you can do whatever you need to do with it, for example copy somewhere 
		FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshota.png"));
		Thread.sleep(5);
		driver.findElement(By.id("menu-item-550")).click();
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Now you can do whatever you need to do with it, for example copy somewhere 
		FileUtils.copyFile(scrFile1, new File("c:\\tmp\\screenshotb.png"));
		Thread.sleep(5);
		driver.findElement(By.className("elementor-animation-grow")).click();
		Thread.sleep(10000);
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Now you can do whatever you need to do with it, for example copy somewhere 
		FileUtils.copyFile(scrFile2, new File("c:\\tmp\\screenshotc.png"));
		driver.findElement(By.className("elementor-widget-container")).click();
		File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Now you can do whatever you need to do with it, for example copy somewhere 
		FileUtils.copyFile(scrFile3, new File("c:\\tmp\\screenshotd.png"));
		Thread.sleep(50);
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list);
		Thread.sleep(500);
		
		//driver.close();
		
	}

}
