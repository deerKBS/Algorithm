package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1003 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int tc=0; tc<T; tc++){
            int N = Integer.parseInt(br.readLine());
            if(N<1) sb.append("1 0\n");
            else fibonacci(N);
        }
        System.out.print(sb);
    }

    public static void fibonacci(int N){
        int[][] fib = new int[N+1][2];
        fib[0][0]+=1;
        fib[1][1]+=1;
        for(int i=2; i<=N; i++){
            fib[i][0]=fib[i-2][0]+fib[i-1][0];
            fib[i][1]=fib[i-2][1]+fib[i-1][1];
        }
        sb.append(fib[N][0]).append(' ').append(fib[N][1]).append("\n");
    }
}