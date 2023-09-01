package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1107 {
    static boolean[] breakList = new boolean[10];
    static int count;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int goal = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        if(N!=0) {
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                breakList[Integer.parseInt(st.nextToken())] = true;
            }
        }
        int current = 100;
        int min = Math.abs(current-goal);
        int x = -1;
        if(current<goal) x = 1;

        if(current==goal) min=0;
        else {
            while (current>0 && current<1000000) {
                current += x;

                if(check(current)) {
                    min = Math.min(min, Math.abs(current - goal) + count);
                }
            }
        }
        System.out.println(min);
    }
    static boolean check(int c){
        count=1;
        while(c>=10){
            if(breakList[c%10]) return false;
            c/=10;
            count++;
        }
        return !breakList[c];
    }
}
