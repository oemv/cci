package com.oemv.cci.ch2;

import java.util.Iterator;
import java.util.LinkedList;

public class Q11 {
	public static <E> int posToEnd(E e, LinkedList<E> list) {
		if (null == list || null == e || list.isEmpty()) {
			return 0;
		}

		int i = 0;
		int size = list.size();
		Iterator<E> it = list.iterator();

		while (it.hasNext()) {
			i++;
			if (e.equals(it.next())) {
				return size - i;
			}
		}

		return -1;
	}
}
