package basic.subset;

public class Subset_param_BitMask {
	
	static int COUNT;
	static int[] src = {1,2,3,4,5};

	public static void main(String[] args) {
		//boolean[] select = new boolean[src.length];
		subset(0, 0); // 두 번째 0은 select 배열 대신 사용됨. 각 비트는 0으로 시작해 모두 false임을 의미.
		System.out.println(COUNT);
	}
	
	static void subset(int srcIdx, int select) {
		// 기저 조건
		if(srcIdx == src.length) {
			printSubset(select);
			COUNT++;
			return;
		}
		
		// 현재 srcIdx의 원소를 선택 혹은 비선택 2가지 경우로 재귀호출을 이어간다.
		
		// 선택=> select 배열의 srcIdx를 true
//		select[srcIdx]=true;
		subset(srcIdx+1, select|1<<srcIdx); // <= 넘겨받은 mask 에 srcIdx 번째 bit를 1로 변경
		
		// 비선택=> select 배열의 srcIdx 를 false
//		select[srcIdx]=false;
		subset(srcIdx+1, select); // <= 넘겨받은 mask 에 변화 x
	}
	
	static void printSubset(int select) { // 부분집합이 만들어졌을 때 동작 정의.
		for(int i=0; i<src.length; i++) {
			if((select&1<<i)!=0) { // i번째 인덱스 값이 0이 아니면 (true이면) 출력
				System.out.print(src[i]+" ");
			}
		}
		System.out.println();
	}
}
