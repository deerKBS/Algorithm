package BOJ.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_1927 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0){
                if(pq.isEmpty()) sb.append(0);
                else sb.append(pq.poll());
                sb.append("\n");
            }else{
                pq.add(num);
            }
        }
        System.out.print(sb);
    }
}
