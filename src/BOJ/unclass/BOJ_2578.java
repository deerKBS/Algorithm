package BOJ.unclass;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2578 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		int[][] matrix = new int[5][5];
		for(int i=0; i<5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				matrix[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		int[] list = new int[25];
		for(int i=0; i<5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				list[i*5+j]=Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<25; i++) {
			
		}
		
	}
	
	static int 수직() {
		
	}
	
	static int 수평() {
		
	}
	
	static int 좌상우하() {
		
	}
	
	static int 좌하우상() {
		
	}

}
