package com.oemv.cci.ch1;

public class Q4Temp {

	// Solution 2: O(N) --> keeping track of oddCounts as the phrase is iterated
	public static boolean isPermutationOfPalindrome(String phrase) {
		int[] counts = new int[27];
		int oddCount = 0;
		for (char _char : phrase.toCharArray()) {
			int c = map(_char);
			if (c != -1) {
				counts[c]++;
				if ((counts[c] % 2) == 0) {
					oddCount--;
				} else {
					oddCount++;
				}
			}
		}
		return oddCount < 2;
	}

	/**
	 * Maps a character to a number of 1 to 26 (case-insensitive). <br />
	 * a->1, b->2, C->3, D->4, ...
	 * 
	 * @param _char
	 * @return
	 */
	public static int map(char _char) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int $char = Character.getNumericValue(_char);
		return ($char <= z && $char >= a) ? $char - a + 1 : -1;
	}

	// Solution 3: O(N) Optimizing space using a bit-vector
	public static boolean isPermutationOfPalindrome2(String phrase) {
		int vector = createVector(phrase);
		return (vector == 0) || isSingleBitOn(vector);
	}

	/**
	 * Takes a string and generates an bit vector that represents the parity of
	 * the letters
	 * 
	 * @param phrase
	 * @return
	 */
	public static int createVector(String phrase) {
		int vector = 0;
		for (char c : phrase.toCharArray()) {
			if (!Character.isWhitespace(c)) {
				vector = toggle(vector, c);
			}
		}
		return vector;
	}

	/**
	 * Toggles a bit in a bit vector
	 * 
	 * @param vector
	 * @param c
	 * @return
	 */
	public static int toggle(int vector, char c) {
		int mask = 1 << map(c);
		return vector ^= mask;
	}

	public static boolean isSingleBitOn(int vector) {
		return ((vector - 1) & vector) == 0;
	}
}
