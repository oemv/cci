package com.oemv.cci.ch1;

public class Q9 {
	
	public static boolean isRotation(String original, String testString) {
		int len = testString.length();
		if (len == original.length() && len > 0) {
			String concat = testString + testString;
			return isSubString(concat, original);
		}
		return false;
	}

	public static boolean isSubString(String container, String contained) {
		return container.contains(contained);
	}
}
