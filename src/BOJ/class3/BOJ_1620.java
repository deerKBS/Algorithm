import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_1620 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		Map<Integer, String> ency = new HashMap<>();
		Map<String, Integer> ency2 = new HashMap<>();
		
		for(int i=1; i<=N; i++) {
			String str = br.readLine();
			ency.put(i, str);
			ency2.put(str, i);
		}
		
		for(int i=0; i<M; i++) {
			String str = br.readLine();
			if(str.charAt(0)<='9') {
				sb.append(ency.get(Integer.parseInt(str))+"\n");
			}
			else {
				sb.append(ency2.get(str)+"\n");;
			}
		}
		System.out.println(sb);
	}
}
