package com.oemv.cci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Q1Test {

	@Test
	public void isUnique() {
		Assert.assertTrue(Q1.isUnique("ABC"));
		Assert.assertTrue(Q1.isUnique2("ABC"));
	}

	@Test
	public void isNonUnique() {
		Assert.assertFalse(Q1.isUnique("ABB"));
		Assert.assertFalse(Q1.isUnique("CCC"));

		Assert.assertFalse(Q1.isUnique2("ABB"));
		Assert.assertFalse(Q1.isUnique2("CCC"));
	}
}
