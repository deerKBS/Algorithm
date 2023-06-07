package BOJ.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2751 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[2000001];
		for(int i=0; i<N; i++) {
			int n = Integer.parseInt(br.readLine());
			arr[n+1000000]=1;
		}
		
		for(int i=0; i<2000001; i++) {
			if(arr[i]==1) {
				sb.append(i-1000000).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
