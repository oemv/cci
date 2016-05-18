package com.oemv.cci.ch2;

import java.util.Iterator;
import java.util.LinkedList;

public class Q11 {
	
	public static <E> E getKthToLast(int k, LinkedList<E> list) {
		int size = list.size();
		if (null == list || list.isEmpty() || k >= size) {
			return null;
		}

		int i = 0;
		Iterator<E> it = list.iterator();

		while (it.hasNext()) {
			i++;
			E e = it.next();
			if (i == (size - k)) {
				return e;
			}
		}

		return null;
	}

}
