import java.io.*;

public class BOJ_1463_DP {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int[] dp = new int[N+1];
		for(int i=2; i<=N; i++) {
			dp[i]=Math.min(dp[i-1]+1, Math.min(dp[i/3]+1+i%3, dp[i/2]+1+i%2));
		}
		System.out.println(dp[N]);
	}
}
