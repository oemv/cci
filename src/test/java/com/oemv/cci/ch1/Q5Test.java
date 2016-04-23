package com.oemv.cci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Q5Test {

	@Test
	public void testOneEditAway() {
		Assert.assertTrue(Q5.oneEditAway("pale", "ple"));
		Assert.assertTrue(Q5.oneEditAway("pales", "pale"));
		Assert.assertTrue(Q5.oneEditAway("pale", "bale"));
		Assert.assertTrue(Q5.oneEditAway("apple", "aple"));
	}

	@Test
	public void testNonOneEditAway() {
		Assert.assertFalse(Q5.oneEditAway("pale", "bake"));
		Assert.assertFalse(Q5.oneEditAway("ab", "ba"));
	}

	@Test
	public void testOneEditAway2() {
		Assert.assertTrue(Q5.oneEditAway2("pale", "ple"));
		Assert.assertTrue(Q5.oneEditAway2("pales", "pale"));
		Assert.assertTrue(Q5.oneEditAway2("pale", "bale"));
		Assert.assertTrue(Q5.oneEditAway2("apple", "aple"));
	}

	@Test
	public void testNonOneEditAway2() {
		Assert.assertFalse(Q5.oneEditAway2("pale", "bake"));
		Assert.assertFalse(Q5.oneEditAway2("ab", "ba"));
	}
}
