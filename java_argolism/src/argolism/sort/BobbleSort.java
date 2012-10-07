package argolism.sort;

public class BobbleSort {
	
	/**
	 * バブルソート
	 * @param a
	 */
	public static void sort(int a[]) {
		
		int k = a.length - 1;
		
		while (k >= 0) {
			int j = -1;
			for (int i = 1; i <= k; i++) {
				
				if (a[i - 1] > a[i]) {
					
					j = i - 1;
					int swap = a[j];
					a[j] = a[i];
					a[j] = swap;
				}
			}
			k = j;
		}
	}
	
    /** テストデータの最大サイズ **/
	static final int MAXSIZE = 10000;
	
	/**
	 * ソートの速度を計測する
	 * @param args
	 */
	public static void main(String args[]) {
		
		int dataArray[] = new int[MAXSIZE];		
		for(int index = 0; index < MAXSIZE; ++index) {
			dataArray[index] = index;
		}
				
		long startTime = System.currentTimeMillis();
		sort(dataArray);
		long endTime = System.currentTimeMillis();
		
		System.out.println(msToSecond(endTime - startTime));
	}
	
	/**
	 * ミリ秒から秒への変換
	 * @param t
	 * @return
	 */
	public static String msToSecond (long t) {
		return t/1000 + "." + t%1000;
	}
}
