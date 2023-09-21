package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_5525 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		char[] S = br.readLine().toCharArray();
		
		boolean connect = false;
		int cnt = 0;
		int ans = 0;
		for(int i=0; i<M-1; i++) {
			if(connect) {
				if(S[i]=='O' && S[i+1]=='I') {
					i++;
					cnt++;
					continue;
				}
				if(cnt>=N) ans+=cnt-N+1;
				cnt=0;
				if(S[i]=='O') connect=false;
			}else if(S[i]=='I'){
				connect=true;
			}
		}
		if(cnt>=N) ans+=cnt-N+1;
		System.out.println(ans);
	}

}
