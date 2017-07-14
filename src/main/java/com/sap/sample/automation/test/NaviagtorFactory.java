package com.sap.sample.automation.test;

public class NaviagtorFactory {
	private static Navigation navigator = null;

	private NaviagtorFactory() {

	}

	public static synchronized Navigation getNavigator() {
		if (navigator == null) {
			navigator = new Navigation();
		}
		return navigator;
	}
}
