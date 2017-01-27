package zz.algo.string;

import zz.algo.Utils;

public class LongestCommonSubsequence {

	public static String lcs(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int c[][] = new int[m+1][n+1];
		for(int i = 0; i <= m; i++) {
			c[i][0] = 0;
		}
		for(int j = 0; j <= n; j++) {
			c[0][j] = 0;
		}
		for(int i = 1; i <= s1.length(); i++) {
			for(int j = 1; j <= s2.length(); j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					c[i][j] = c[i-1][j-1] + 1;
				}
				else {
					c[i][j] = Utils.maxValue(c[i-1][j], c[i][j-1]);
				}
			}
		}
		
		printArray(c);
		
		StringBuilder sb = new StringBuilder();
		int i = m, j = n;
		while(i > 0 && j > 0) {
			if(s1.charAt(i-1) == s2.charAt(j-1)) {
				sb.append(s1.charAt(i-1));
				i--;
				j--;
			}
			else if(c[i-1][j] >= c[i][j-1]) {
				i--;
			}
			else {
				j--;
			}
		}
		sb.reverse();
		return sb.toString();
	}
	
	private static void printArray(int[][] c) {
		for(int i = 0; i < c.length; i++) {
			int[] r = c[i];
			for(int j = 0; j < r.length; j++) {
				System.out.print(r[j] + "  ");
			}
			System.out.println();
		}
	}
}
