package com.oemv.cci.ch2;

import static java.util.Arrays.asList;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class Q11Test {

	@Test
	public void testPostToEnd1() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		String result = Q11.getKthToLast(1, list);
		Assert.assertEquals("E", result);
	}

	@Test
	public void testPostToEnd2() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		String result = Q11.getKthToLast(5, list);
		Assert.assertEquals("A", result);
	}

	@Test
	public void testFinalAlready() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		String result = Q11.getKthToLast(0, list);
		Assert.assertEquals("F", result);
	}

	@Test
	public void testNotFound() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		String result = Q11.getKthToLast(10, list);
		Assert.assertEquals(null, result);
	}

}
