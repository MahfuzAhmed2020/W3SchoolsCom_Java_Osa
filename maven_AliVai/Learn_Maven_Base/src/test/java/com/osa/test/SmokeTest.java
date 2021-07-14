package com.osa.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.osa.browser.Base;

public class SmokeTest  {
	public WebDriver dr;
	
	@Test
	public void Osa() {
		dr=Base.openBrowser("chrome");
		dr.get("https://osaconsultingtech.com/");
		
		
		
		
	}
	
	

}
