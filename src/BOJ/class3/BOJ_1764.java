package BOJ.class3;

import java.io.*;
import java.util.*;

public class BOJ_1764 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<String, Boolean> map = new HashMap<>();
		
		for(int i=0; i<N; i++) {
			map.put(br.readLine(), true);
		}
		
		List<String> list = new ArrayList<>();
		for(int i=0; i<M; i++) {
			String str = br.readLine();
			if(map.containsKey(str)) {
				list.add(str);
			}
		}
		
		Collections.sort(list);
		
		StringBuilder result = new StringBuilder();
		result.append(list.size());
		for(String str : list) {
			result.append("\n").append(str);
		}
		System.out.print(result);
	}
}
