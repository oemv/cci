package com.oemv.cci.ch1;

public class Q3 {

	public static String encodeWhitespaces(String uri, int size) {
		char[] data = uri.toCharArray();
		int spaces = count(data, size);
		if (spaces == 0)
			return uri;

		int endIdx = data.length - 1;
		int strIdx = size - 1;
		while (spaces > 0) {
			if (Character.isWhitespace(data[strIdx])) {
				data[endIdx] = '0';
				data[endIdx - 1] = '2';
				data[endIdx - 2] = '%';
				endIdx -= 3;
				strIdx--;
				spaces--;
			} else {
				data[endIdx--] = data[strIdx--];
			}
		}

		return new String(data);
	}

	private static int count(char[] src, int size) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			if (Character.isWhitespace(src[i])) {
				count++;
			}
		}
		return count;
	}

}
