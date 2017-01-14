package zz.algo.string;

import zz.algo.Utils;

public class StringDistance {

	public static int calcDistance(String s1, String s2) {
		if(s1.equals("")) {
			return s2.length();
		}
		if(s2.equals("")) {
			return s1.length();
		}
		
		if(s1.charAt(0) == s2.charAt(0)) {
			return calcDistance(s1.substring(1), s2.substring(1));
		}
		else {
			int d1 = calcDistance(s1.substring(1), s2);
			int d2 = calcDistance(s1, s2.substring(1));
			int d3 = calcDistance(s1.substring(1), s2.substring(1));
			return  Utils.minValue(d1, d2, d3) + 1;
		}
	}
	
	public static int calcDistanceDP(String s1, String s2) {
		int[][] dp = new int[s1.length() + 1][s2.length() + 1];
		
		for(int i = 1; i <= s1.length(); i++) {
			dp[i][0] = i;
		}
		for(int j = 1; j <= s2.length(); j++) {
			dp[0][j] = j;
		}
		
		int cost = 0;
		for(int i = 1; i <= s1.length(); i++) {
			for(int j = 1; j <= s2.length(); j++) {
				if(s1.charAt(i - 1) == s2.charAt(j - 1)) {
					cost = 0;
				}
				else {
					cost = 1;
				}
				dp[i][j] = Utils.minValue(
						dp[i - 1][j] + 1, 
						dp[i][j - 1] + 1,
						dp[i - 1][j - 1] + cost);
			}
		}
		return dp[s1.length()][s2.length()];
	}
	
	static int[][] memo = null;
	public static int calcDistanceMemo(String s1, String s2) {
		memo = null;
		return _calcDistanceMemo(s1, s2);
	}
	
	public static int _calcDistanceMemo(String s1, String s2) {
		if(memo == null) {
			memo = new int[s1.length() + 1][s2.length() + 1];
			for(int i = 0; i <= s1.length(); i++) {
				for(int j = 0; j <= s2.length(); j++) {
					memo[i][j] = -1;
				}
			}
		}
		
		if(memo[s1.length()][s2.length()] != -1) {
			return memo[s1.length()][s2.length()];
		}
		
		if(s1.equals("")) {
			int cost = s2.length();
			memo[0][s2.length()] = cost;
			return cost;
		}
		if(s2.equals("")) {
			int cost = s1.length();
			memo[s1.length()][0] = cost;
			return cost;
		}
		if(s1.charAt(0) == s2.charAt(0)) {
			int d = _calcDistanceMemo(s1.substring(1), s2.substring(1));
			memo[s1.length()][s2.length()] = d;
			return d;
		}
		else {
			int d1 = _calcDistanceMemo(s1.substring(1), s2);
			int d2 = _calcDistanceMemo(s1, s2.substring(1));
			int d3 = _calcDistanceMemo(s1.substring(1), s2.substring(1));
			int d = Utils.minValue(d1, d2, d3) + 1;
			memo[s1.length()][s2.length()] = d;
			return d;
		}
	}
}
