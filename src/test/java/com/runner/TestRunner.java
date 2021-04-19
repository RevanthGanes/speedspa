package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.base.JVMreport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "Feature" }, glue = { "com.step" }, tags = "@SPEEDSpaFlow", plugin = {
		"pretty", "json:target\\Reporting\\cucumber.json", "junit:target\\Reporting\\cucumber.xml",
		"html:target\\Reporting\\" }, monochrome = true)

public class TestRunner {
	@AfterClass
	public static void afterClass() {
		BaseClass.driver.quit();
		JVMreport.generateJVMReport(System.getProperty("user.dir") + "\\target\\Reporting\\cucumber.json");
	}

}
