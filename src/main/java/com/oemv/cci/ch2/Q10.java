package com.oemv.cci.ch2;

import java.util.LinkedList;

public class Q10 {

	public static <T> LinkedList<T> removeDups(LinkedList<T> src) {
		for (int i = 0; i < src.size() - 1; i++) {
			T t = src.get(i);
			for (int j = i + 1; j < src.size();) {
				if (t.equals(src.get(j))) {
					src.remove(j);
				} else {
					j++;
				}
			}
		}		
		return src;
	}
}
