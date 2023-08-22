package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_1003 {
    static int count0;
    static int count1;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int tc=0; tc<T; tc++){
            count0=0;
            count1=0;
            fibonacci(Integer.parseInt(br.readLine()));
            sb.append(count0).append(' ').append(count1).append("\n");
        }
        System.out.print(sb);
    }

    public static int fibonacci(int n){
        if(n==0){
            count0++;
            return 0;
        }else if(n==1){
            count1++;
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}