package BOJ.class3;

import java.io.*;

public class BOJ_1003 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int t=0; t<T; t++){
            int N = Integer.parseInt(br.readLine());
            int[][] fib = new int[N+3][2];
            fib[0][0]+=1;
            fib[1][1]+=1;
            for(int i=2; i<=N; i++){
                fib[i][0]=fib[i-2][0]+fib[i-1][0];
                fib[i][1]=fib[i-2][1]+fib[i-1][1];
            }
            sb.append(fib[N][0]).append(' ').append(fib[N][1]).append("\n");
        }
        System.out.print(sb);
    }
}