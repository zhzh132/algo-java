package zz.algo;

public class Utils {

	public static int minValue(int val, int... val2) {
		int min = val;
		for(int v : val2) {
			if(v < min) {
				min = v;
			}
		}
		return min;
	}
}
