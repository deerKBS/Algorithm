package BOJ.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_10773 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		
		Deque<Integer> d = new ArrayDeque<>();
		for(int i=0; i<K; i++) {
			int value = Integer.parseInt(br.readLine());
			if(value==0) d.pollLast();
			else d.add(value);
		}
		int sum=0;
		while(!d.isEmpty()) {
			sum+=d.poll();
		}
		System.out.println(sum);
	}
}
