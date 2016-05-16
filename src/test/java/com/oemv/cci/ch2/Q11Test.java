package com.oemv.cci.ch2;

import static java.util.Arrays.asList;

import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;

public class Q11Test {

	@Test
	public void testPostToEnd1() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		int result = Q11.posToEnd("E", list);
		Assert.assertEquals(1, result);
	}

	@Test
	public void testPostToEnd2() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		int result = Q11.posToEnd("A", list);
		Assert.assertEquals(5, result);
	}

	@Test
	public void testFinalAlready() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		int result = Q11.posToEnd("F", list);
		Assert.assertEquals(0, result);
	}

	@Test
	public void testNotFound() {
		LinkedList<String> list = new LinkedList<String>(asList(new String[] { "A", "B", "C", "D", "E", "F" }));
		int result = Q11.posToEnd("X", list);
		Assert.assertEquals(-1, result);
	}

}
