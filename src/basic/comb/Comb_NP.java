package basic.comb;

import java.util.Arrays;

public class Comb_NP {

	static int[] src = {1, 2, 3, 4, 5, 6};
	static int[] tgt = new int[3];
	
	static int[] index = new int[src.length];
	
	public static void main(String[] args) {
		// 0 1 0 1 0 1  ->  2, 4, 5
		// 1 1 1 0 0 0  ->  1, 2, 3
		
		// 0 0 0 1 1 1 // 6개 중에 3개를 뽑는거.  NextPermutation의 대상은 src가 아니라 000111이다.
		// ...
		// 1 1 1 0 0 0
		
		// tgt 수 만큼 index 배열의 뒤쪽을 1로 채운다.
		for(int i= src.length-1; i>=src.length-tgt.length; i--) {
			index[i] = 1;
		}
		
		System.out.println(Arrays.toString(index)); //확인
		
		while(true) {
			// np가 완성된 상태. 하지만 조합이 완성된 상태 X
			int tgtIdx = 0;
			for(int i=0; i<index.length; i++) {
				if(index[i]==1) {
					tgt[tgtIdx++] = src[i];
				}
			}
			// tgt 조합이 완성된 상태
			// complete code
			System.out.println(Arrays.toString(index)+ " " +Arrays.toString(tgt));
			
			if(!np(index)) break;
		}
	}

	static boolean np(int[] array) {
		int i = array.length - 1;
		
		while( i > 0 && array[i-1]>=array[i]) --i; // descending order 이면 계속 앞으로 이동
		// 만약 맨 앞이면
		if(i==0) return false;
		// array[i-1] 이 앞쪽 swap 대상
		
		int j=array.length-1;
		while(array[i-1]>=array[j]) j--;
		//array[j] 뒤쪽 swap 대상
		swap(array, i-1, j);
		
		int k = array.length-1;
		while(i<k) {
			swap(array, i++,k--);
		}
		
		return true;
	}
	static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i]=array[j];
		array[j]=temp;
	}

}
