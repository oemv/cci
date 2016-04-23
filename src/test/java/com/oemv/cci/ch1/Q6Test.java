package com.oemv.cci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Q6Test {

	@Test
	public void testIsEncoded() {
		Assert.assertEquals("a3", Q6.compress("aaa"));
		Assert.assertEquals("a3b4a5", Q6.compress("aaabbbbaaaaa"));
	}

	@Test
	public void testIsNotEncoded() {
		Assert.assertEquals("aa", Q6.compress("aa"));
		Assert.assertEquals("aabbcc", Q6.compress("aabbcc"));
		Assert.assertEquals("abc", Q6.compress("abc"));
	}

	@Test
	public void testIsCompressed2() {
		Assert.assertEquals("a3", Q6.compress2("aaa"));
		Assert.assertEquals("a3b4a5", Q6.compress2("aaabbbbaaaaa"));
	}

	@Test
	public void testIsNotCompressed2() {
		Assert.assertEquals("aa", Q6.compress2("aa"));
		Assert.assertEquals("aabbcc", Q6.compress2("aabbcc"));
		Assert.assertEquals("abc", Q6.compress2("abc"));
	}

}
