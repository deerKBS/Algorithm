package basic.subset;

public class Subset_param {

	static int COUNT;
	static int[] src = {1,2,3,4,5};
	
	public static void main(String[] args) {
		boolean[] select = new boolean[src.length];
		subset(0, select);
		System.out.println(COUNT);

	}
	
	static void subset(int srcIdx, boolean[] select) {
		// 기저 조건
		if(srcIdx == src.length) {
			printSubset(select);
			COUNT++;
			return;
		}
		
		// 현재 srcIdx의 원소를 선택 혹은 비선택 2가지 경우로 재귀호출을 이어간다.
		
		// 선택=> select 배열의 srcIdx를 true
		select[srcIdx]=true;
		subset(srcIdx+1, select);
		
		// 비선택=> select 배열의 srcIdx 를 false
		select[srcIdx]=false;
		subset(srcIdx+1, select);
	}
	
	static void printSubset(boolean[] select) { // 부분집합이 만들어졌을 때 출력 동작 정의.
		for(int i=0; i<src.length; i++) {
			if(select[i]) System.out.print(src[i]+" ");
		}
		System.out.println();
	}
}
