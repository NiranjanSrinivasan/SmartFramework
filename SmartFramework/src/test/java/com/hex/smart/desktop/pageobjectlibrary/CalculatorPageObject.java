package com.hex.smart.desktop.pageobjectlibrary;

import java.io.File;

import java.net.*;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

public class CalculatorPageObject {

	
	
	public static void main(String[] args) throws Exception {
		
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
//		options.setDebugConnectToRunningApp(true);
//		WiniumDriverService service = new WiniumDriverService.Builder().usingDriverExecutable(new File("D:\\Winium.Desktop.Driver.exe")).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), options);
//		service.start(); 
		Thread.sleep(2000);
//		driver.findElement(By.id("num9Button")).click();
//		driver.findElement(By.name("num6Button")).click();
		String result = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
		System.out.println(result);
	}
}
