package com.runner.learn;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.utilityfiles.learn.Utility_File_Base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)  //---- Cucumber with J-unit
@CucumberOptions(features = ".\\Feature" ,

			glue = "com.stepdef.learn" ,
			
			monochrome= true,
			
			dryRun =false,  // before running it will check the step def and feauture are same and it will throw missing snippets from step def 
			
			
			publish=false,// while running it will check the step def and feature 
			
		

			
			plugin= {
					
					"html:Report/adactinreport.html" ,
					
					"pretty" ,
					
					"json:Report/adactinreport.json"
					
					
			}
			)

public class Adactin_Runner_Oct {

	public static WebDriver driver;  //--->null
	
	@BeforeClass
	public static void set_Up() {

		driver=Utility_File_Base.browser_Launch("chrome");
	}

	@AfterClass
	public static void tear_Down() {

		driver.close();
	}
}
