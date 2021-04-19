package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMreport {
	public static void generateJVMReport(String jsonfiles) {

		File file = new File( "C:\\Users\\Revanth\\workspace\\SPEEDSpa1\\target\\Reporting");
		                      
		Configuration configuration = new Configuration(file, "Speed Spa");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("os", "Win-10");

		List<String> jsonfile = new ArrayList<String>();
		jsonfile.add(jsonfiles);

		ReportBuilder builder = new ReportBuilder(jsonfile, configuration);
		builder.generateReports();

	}
}
