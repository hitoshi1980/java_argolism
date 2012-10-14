package argoism.search;

public class LinearSearch {

	/** 発見できない場合 **/
	private static final int NOT_FOUND = -1;

	public static int find (int x, int[] a, int left, int right) {
		
		while (left < right) {
			
			int mid = (left + right) / 2;
			
			if (a[mid] < x) {
				left = mid + 1;
			}
			else {
				right = mid;
			}			
		}
		
		if (a[left] == x) {
			return left;
		}
		return NOT_FOUND;
	}
	
	private static void main(String args) {
		
	}
}
