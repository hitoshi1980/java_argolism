
public class BobbleSort {
	
	public static void sort(int a[]) {
		int k = a.length - 1;
		while (k >= 0 ) {
			int j = -1;
			for (int i = 1; i <= k; i++) {
				if (a[i - 1] > a[i]) {
					j = i - 1;
					int swap = a[j]; a[j] = a[i]; a[j] = swap;
				}
			}
			k = j;
		}
	}
	
	public void main(String args[]) {
		
	}
}
