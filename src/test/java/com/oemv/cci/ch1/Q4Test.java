package com.oemv.cci.ch1;

import org.junit.Assert;
import org.junit.Test;

public class Q4Test {

	@Test
	public void testIsPermutationOfPalindrome() {
		Assert.assertTrue(Q4.isPermutationOfPalindrome("aa cco "));
		Assert.assertTrue(Q4.isPermutationOfPalindrome("coca cola c"));
		Assert.assertTrue(Q4.isPermutationOfPalindrome("x"));
		Assert.assertTrue(Q4.isPermutationOfPalindrome("xx"));
		Assert.assertTrue(Q4.isPermutationOfPalindrome("xxxx"));
	}

	@Test
	public void testIsNotPermutationOfPalindrome() {
		Assert.assertFalse(Q4.isPermutationOfPalindrome("home"));
		Assert.assertFalse(Q4.isPermutationOfPalindrome("taco tuesday"));
		Assert.assertFalse(Q4.isPermutationOfPalindrome("x xca"));
	}

	@Test
	public void testMapCharacter() {
		Assert.assertTrue(Q4.map('a') == 1);
		Assert.assertTrue(Q4.map('b') == 2);
		Assert.assertTrue(Q4.map('z') == 26);

		Assert.assertTrue(Q4.map('A') == 1);
		Assert.assertTrue(Q4.map('Z') == 26);
	}

	@Test
	public void testToggleBit() {
		int vector = 0;
		int toggled = Q4.toggle(vector, 'c');
		Assert.assertEquals("1000", Integer.toBinaryString(toggled));
		Assert.assertTrue(0 == Q4.toggle(toggled, 'c'));
	}

	@Test
	public void testIsPermutationOfPalindrome2() {
		Assert.assertTrue(Q4.isPermutationOfPalindrome2("Coa Coa"));
		Assert.assertTrue(Q4.isPermutationOfPalindrome2("x"));
		Assert.assertTrue(Q4.isPermutationOfPalindrome2("xx"));
		Assert.assertTrue(Q4.isPermutationOfPalindrome2("Anita lava LA tina"));
	}

	@Test
	public void testIsNotPermutationOfPalindrome2() {
		Assert.assertFalse(Q4.isPermutationOfPalindrome2("home"));
		Assert.assertFalse(Q4.isPermutationOfPalindrome2("taco tuesday"));
		Assert.assertFalse(Q4.isPermutationOfPalindrome2("x xca"));
		Assert.assertFalse(Q4.isPermutationOfPalindrome2("Tacos"));
		Assert.assertFalse(Q4.isPermutationOfPalindrome2("Godzilla"));
		Assert.assertFalse(Q4.isPermutationOfPalindrome2("Banana"));
	}

	@Test
	public void testIsPermutationOfPalindrome3() {
		Assert.assertTrue(Q4.isPermutationOfPalindrome3("Coa Coa"));
		Assert.assertTrue(Q4.isPermutationOfPalindrome3("x"));
		Assert.assertTrue(Q4.isPermutationOfPalindrome3("xx"));
		Assert.assertTrue(Q4.isPermutationOfPalindrome3("Anita lava LA tina"));
	}

	@Test
	public void testIsNotPermutationOfPalindrome3() {
		Assert.assertFalse(Q4.isPermutationOfPalindrome("home"));
		Assert.assertFalse(Q4.isPermutationOfPalindrome("taco tuesday"));
		Assert.assertFalse(Q4.isPermutationOfPalindrome("x xca"));
		Assert.assertFalse(Q4.isPermutationOfPalindrome3("Tacos"));
		Assert.assertFalse(Q4.isPermutationOfPalindrome3("Godzilla"));
		Assert.assertFalse(Q4.isPermutationOfPalindrome3("Banana"));
	}
}
