package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BOJ_1931 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<int[]> pq = new PriorityQueue<>((h1, h2)->{
            if(h1[1]==h2[1]) return h1[0]-h2[0];
            return h1[1]-h2[1];});
        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            pq.add(new int[]{s, e});
        }
        int latestEnd = 0;
        int ans = 0;
        while(!pq.isEmpty()){
            int[] se = pq.poll();
            if(latestEnd<=se[0]){
                ans++;
                latestEnd = se[1];
            }
        }
        System.out.println(ans);
    }
}
