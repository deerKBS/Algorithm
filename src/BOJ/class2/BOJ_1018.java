import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1018 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		char[][] arr = new char[N][];
		
		for(int i=0; i<N; i++) {
			arr[i]=br.readLine().toCharArray();
		}
		
		int cnt, min=64;
		char norm;
		for(int i=0; i<=N-8; i++) {
			for(int j=0; j<=M-8; j++) {
				norm = arr[i][j];
				cnt=0;
				for(int y=i; y<i+8; y++) {
					for(int x=j; x<j+8; x++) {
						if((x+y)%2==0) {
							if(arr[y][x]!=norm) cnt++;
						}
						else if(arr[y][x]==norm) cnt++;
					}
				}
				if(cnt>=32) cnt=64-cnt;
				min=Math.min(min, cnt);
			}
		}
		System.out.println(min);
	}
}
