package com.oemv.cci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Q9Test {

	@Test
	public void testIsRotation() {
		Assert.assertTrue(Q9.isRotation("tacos", "costa"));
		Assert.assertTrue(Q9.isRotation("aaa", "aaa"));
		Assert.assertTrue(Q9.isRotation("abcde", "eabcd"));
		Assert.assertTrue(Q9.isRotation("aabaa", "aaaba"));
	}

	@Test
	public void testIsNotRotation() {
		Assert.assertFalse(Q9.isRotation("tacos", "cosat"));
		Assert.assertFalse(Q9.isRotation("camera", "macera"));
	}
}
