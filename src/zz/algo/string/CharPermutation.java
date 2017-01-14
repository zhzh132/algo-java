package zz.algo.string;

import java.util.ArrayList;
import java.util.List;

import zz.algo.Utils;

public class CharPermutation {

	public static List<String> permutation(String str) {
		if(str.length() == 0) {
			return new ArrayList<String>();
		}
		
		ArrayList<String> list = new ArrayList<String>(Utils.factorial(str.length()));
		calcPerm(str.toCharArray(), 0, str.length() - 1, list);
		return list;
	}
	
	private static void calcPerm(char[] cs, int start, int end, ArrayList<String> list) {
		if(start == end) {
			list.add(new String(cs));
		}
		else {
			for(int i = start; i <= end; i++) {
				char tmp = cs[start];
				cs[start] = cs[i];
				cs[i] = tmp;
				
				calcPerm(cs, start + 1, end, list);
				
				tmp = cs[start];
				cs[start] = cs[i];
				cs[i] = tmp;
			}
		}
	}
	
}
