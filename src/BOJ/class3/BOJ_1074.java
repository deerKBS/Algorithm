package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1074{
    static int N, r, c, ans;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        N = (int)Math.pow(2,N); //2의 N제곱수 <= 계속 2로 혹은 반으로 나눌 수 있다.

        z(0,0);
        System.out.println(ans);
    }

    static void z(int y, int x) { // y, x : 탐색의 시작점 (원점) => r, c => ans 계산
        // 기저조건
        // N을 반복적으로 2로 나누어가면서 계산 => 기저조건> N==1
        if(N==1) return;

        N/=2;

        // r, c가 4 여역 중 어디에 속하는지에 따라 ans 계산
        if(r<y+N && c<x+N) { // 왼쪽 위
            z(y,x); // 원점 그대로
        }
        else if(r<y+N && c>=x+N) {
            ans+=N*N;
            z(y, x+N);
        }
        else if(r>=y+N && c<x+N) {
            ans+=N*N*2;
            z(y+N, x);
        }
        else {
            ans+=N*N*3;
            z(y+N, x+N);
        }
    }
}