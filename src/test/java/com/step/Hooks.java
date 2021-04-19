package com.step;

import com.base.BaseClass;

import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	@Before
	public void beforeMethod() {
		getDriver();
		loadUrl("https://admin-stage.speedspa.io");

	}

}
