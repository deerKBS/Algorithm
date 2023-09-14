package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2630 {
	
	static int[][] paper;
	static int[] count = new int[2];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        paper = new int[N][N];
        for(int i=0; i<N; i++){
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j=0; j<N; j++) {
        		paper[i][j]=Integer.parseInt(st.nextToken());
        	}
        }
        
        dfs(0, 0 , N);
        
        System.out.println(count[0]+"\n"+count[1]);
    }
    
    static void dfs(int y, int x, int n) {
    	int init = paper[y][x];
    	if(n==1) {
    		count[init]++;
    		return;
    	}
    	for(int i=y; i<y+n; i++) {
    		for(int j=x; j<x+n; j++) {
    			if(init!=paper[i][j]) {
    				n/=2;
        			dfs(y,x,n);
        			dfs(y+n, x, n);
        			dfs(y, x+n, n);
        			dfs(y+n, x+n, n);
        			return;
    			}
    		}
    	}
    	count[init]++;
    }
}
