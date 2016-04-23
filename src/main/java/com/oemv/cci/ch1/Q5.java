package com.oemv.cci.ch1;

public class Q5 {

	//My solution 
	public static boolean oneEditAway(String a, String b) {
		int a_length = a.length();
		int b_length = b.length();
		if (Math.abs(a_length - b_length) > 1) {
			return false;
		}
		int a_idx = 0, b_idx = 0, edits = 0;
		while (a_idx < a_length && b_idx < b_length && edits < 2) {
			if (a.charAt(a_idx) == b.charAt(b_idx)) {
				a_idx++;
				b_idx++;
			} else {
				if (a_length > b_length) { // why check this every single time???
					a_idx++;
				} else if (b_length > a_length) { //why check this every single time?
					b_idx++;
				} else {
					a_idx++;
					b_idx++;
				}
				edits++;
			}
		}
		return edits < 2;
	}

	//Book solution 
	public static boolean oneEditAway2(String first, String second) {
		/* Length checks. */
		if (Math.abs(first.length() - second.length()) > 1) {
			return false;
		}

		/* Get shorter and longer string. */
		String s1 = first.length() < second.length() ? first : second;
		String s2 = first.length() < second.length() ? second : first;

		int index1 = 0;
		int index2 = 0;
		boolean foundDifference = false;
		while (index2 < s2.length() && index1 < s1.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				/* Ensure that this is the first difference found. */
				if (foundDifference)
					return false;
				foundDifference = true;
				if (s1.length() == s2.length()) { // On replace, move shorter pointer
					index1++;
				}
			} else {
				index1++; // If matching, move shorter pointer
			}
			index2++; // Always move pointer for longer string
		}
		return true;
	}
}
