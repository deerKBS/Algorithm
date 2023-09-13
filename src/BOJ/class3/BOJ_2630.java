package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_2630 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[][] paper = new char[N][N];
        for(int i=0; i<N; i++){
            paper[i]=br.readLine().toCharArray();
        }



    }
}
