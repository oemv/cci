package com.oemv.cci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Q3Test {
	@Test
	public void testEncodeWhiteSpacesUrl() {
		String url = "http://www.google.com?foo=one two three    ";
		int size = url.trim().length();
		Assert.assertEquals("http://www.google.com?foo=one%20two%20three", Q3.encodeWhitespaces(url, size));
	}
}
