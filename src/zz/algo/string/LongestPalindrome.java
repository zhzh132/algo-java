package zz.algo.string;

public class LongestPalindrome {

	public static String longestPalindrome(String str) {
		if(str.length() == 0) {
			return "";
		}
		
		int max = 0;
		String lp = "";
		for(int i = 0; i < str.length(); i++) {
			int j;
			for(j = 0; i - j >= 0 && i + j < str.length(); j++) {
				if(str.charAt(i - j) != str.charAt(i + j)) {
					break;
				}
			}
			int len = j * 2 - 1;
			if(len > max) {
				max = len;
				lp = str.substring(i - j + 1, i + j);
			}
			
			for(j = 0; i - j >= 0 && i + j + 1 < str.length(); j++) {
				if(str.charAt(i - j) != str.charAt(i + j + 1)) {
					break;
				}
			}
			len = j * 2;
			if(len > max) {
				max = len;
				lp = str.substring(i - j + 1, i + j + 1);
			}
		}
		return lp;
	}
}
