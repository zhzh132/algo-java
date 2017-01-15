package zz.algo.string;

import java.util.HashMap;

public class ContainsAllChar {

	public static boolean containsAll(String a, String b) {
		HashMap<Character, Boolean> map = new HashMap<>();
		char[] ch = b.toCharArray();
		for(char c : ch) {
			map.put(c, false);
		}
		int count = map.size();
		
		ch = a.toCharArray();
		for(char c : ch) {
			if(map.containsKey(c) && map.get(c).equals(false)) {
				map.put(c, true);
				count--;
				if(count == 0) {
					break;
				}
			}
		}
		for(char c : map.keySet()) {
			if(map.get(c).equals(false)) {
				return false;
			}
		}
		return true;
	}
}
