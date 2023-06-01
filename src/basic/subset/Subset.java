package basic.subset;

public class Subset {
	
	static int Count;
	static int[] src = {1, 2, 3, 4, 5};
	static boolean[] select = new boolean[src.length];
	
	public static void main(String[] args) {
		subset(0);
		System.out.println(Count);
	}
	
	static void subset(int srcIdx) {
		// 기저 조건
		if(srcIdx == src.length) {
			printSubset();
			Count++;
			return;
		}
		
		// 현재 srcIdx의 원소를 선택 혹은 비선택  2가지 경우 고려
		
		// 재귀 호출
		// 선택 => select 배열의 srcIdx 를 true
		select[srcIdx]=true;
		subset(srcIdx+1);
		
		// 비선택=> select 배열의 srcIdx 를 false
		select[srcIdx]=false;
		subset(srcIdx+1);
	}
	
	static void printSubset() { // 부분집합이 만들어졌을 때 출력 동작 정의
		for(int i=0; i<select.length; i++) {
			if(select[i]) System.out.print(src[i]+" ");
		}
		System.out.println();
	}
}
