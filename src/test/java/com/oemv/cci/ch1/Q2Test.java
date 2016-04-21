package com.oemv.cci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Q2Test {

	@Test
	public void isPermutation() {
		Assert.assertTrue(Q2.isPermutation("aaa", "aaa"));
		Assert.assertTrue(Q2.isPermutation("aba", "baa"));
	}

	@Test
	public void isNotPermutation() {
		Assert.assertFalse(Q2.isPermutation("aaa", "a"));
		Assert.assertFalse(Q2.isPermutation("aaa", "bbb"));
		Assert.assertFalse(Q2.isPermutation("aa", "aab"));
		Assert.assertFalse(Q2.isPermutation("aa", ""));
	}

}
