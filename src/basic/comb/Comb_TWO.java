package basic.comb;

import java.util.Arrays;

public class Comb_TWO {

	static int COUNT;
	static int[] src = {1,2,3,4,5};
	static int[] tgt = new int[3];
	
	public static void main(String[] args) {
		comb(0,0); // 앞:srcIdx, 뒤: tgtIdx
		System.out.println(COUNT);
	}

	// tgt의 tgtIdx 자리에 src의 수를 고려할 건데, srcIdx 부터 고려 (그 이전 srcIdx는 이미 고려했다)
	static void comb(int srcIdx, int tgtIdx) {
		// 기저 조건 tgt
		if(tgtIdx==tgt.length) {
			System.out.println(Arrays.toString(tgt));
			COUNT++;
			return;
		}
		
		// 기저 조건 src
		if(srcIdx==src.length) return;
		
		tgt[tgtIdx] = src[srcIdx]; //선택!!!
		
		comb(srcIdx+1, tgtIdx+1); // 현재 선택을 받아들이고 src의 다음 자리수를 tgt의 다음 자리수로 고려
		comb(srcIdx+1, tgtIdx); // 현재 선택을 X, srcIdx -> tgtIdx 선택을 부정하고, src의 다음 자리수를 현재 tgtIdx에 다시 고려
		
	}
}
