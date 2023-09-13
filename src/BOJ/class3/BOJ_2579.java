package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2579 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] stairs = new int[N];

        for(int i=0; i<N; i++){
            stairs[i]=Integer.parseInt(br.readLine());
        }
        int[][] dp = new int[N+1][N+1];

        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
            }
        }

    }

}
