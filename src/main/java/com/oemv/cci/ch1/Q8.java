package com.oemv.cci.ch1;

public class Q8 {
	public static int[][] zerofy(int[][] m) {
		int M = m.length;
		int N = m[0].length;
		int[][] registry = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (0 == m[i][j]) {
					registry[i][j] = 1;
				}
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (1 == registry[i][j]) {
					m = _zerofy(m, i, j);
				}
			}
		}

		return m;
	}

	private static int[][] _zerofy(int[][] m, int row, int column) {
		// zerofy row
		for (int i = 0; i < m[0].length; i++) {
			m[row][i] = 0;
		}
		// zerofy column
		for (int i = 0; i < m.length; i++) {
			m[i][column] = 0;
		}
		return m;
	}

	
	/**
	 * Zerofy marking rows and columns
	 * @param m
	 * @return
	 */
	public static int[][] zerofy2(int[][] m) {
		int M = m.length;
		int N = m[0].length;

		int rows[] = new int[M];
		int columns[] = new int[N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (0 == m[i][j]) {
					rows[i] = 1;
					columns[j] = 1;
				}
			}
		}

		for (int i = 0; i < M; i++) {
			if (1 == rows[i]) {
				m = zerofyRow(m, i);
			}
		}

		for (int i = 0; i < N; i++) {
			if (1 == columns[i]) {
				m = zerofyColumn(m, i);
			}
		}

		return m;
	}

	private static int[][] zerofyColumn(int[][] m, int column) {
		for (int i = 0; i < m.length; i++) {
			m[i][column] = 0;
		}
		return m;
	}

	private static int[][] zerofyRow(int[][] m, int row) {
		for (int i = 0; i < m[0].length; i++) {
			m[row][i] = 0;
		}
		return m;
	}
}
