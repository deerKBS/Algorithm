package basic.subset;

public class Subset_BinaryCounting {

	static int[] src = {1,2,3,4,5};
	
	public static void main(String[] args) {
		int subsetCnt = 1<<src.length;
		
		for(int i=0; i<subsetCnt; i++) { // 0 ~ 부분집합의 총 수 -1 까지
			// i 의미? BitMask가 된다.
			for(int j=0; j<src.length; j++) {
				if((i&1<<j)!=0) System.out.print(src[j]+" ");
			}
			System.out.println();
		}
	}
}
