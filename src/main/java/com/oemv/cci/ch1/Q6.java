package com.oemv.cci.ch1;

public class Q6 {

	// My solution O(N), drawback: need to build the string to decide
	public static String compress(String str) {
		StringBuilder encoded = new StringBuilder();
		int i = 0;
		int length = str.length();
		while (i < length) {
			char c = str.charAt(i);
			int count = 1;
			while ((i < length - 1) && c == str.charAt(i + 1)) {
				i++;
				count++;
			}
			i++;
			encoded.append(c).append(count);
		}
		String encoded_string = encoded.toString();
		return length > encoded_string.length() ? encoded_string : str;
	}

	// Solution from book: counts the length of the compressed string upfront
	public static String compress2(String str) {
		int finalLength = countCompression(str);
		if (finalLength >= str.length())
			return str;

		StringBuffer compressed = new StringBuffer(finalLength); // initialize capacity
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;

			// If next character is different than current, append this char to result.
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressed.toString();
	}

	public static int countCompression(String str) {
		int compressedLength = 0;
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;

			// If next character is different than current, append this char to result.
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedLength += 1 + String.valueOf(countConsecutive).length();
				countConsecutive = 0;
			}
		}
		return compressedLength;
	}
}
