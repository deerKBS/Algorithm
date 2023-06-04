package BOJ.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOJ_2108 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[8001];
		int sum=0, min=4000, max=-4000;
		for(int i=0; i<N; i++) {
			int v = Integer.parseInt(br.readLine());
			arr[v+4000]++;
			sum+=v;
			
			if(min>v) min=v;
			if(max<v) max=v;
		}
		sb.append(Math.round((sum*1.0)/N)).append("\n"); // 1 산술평균
		
		int cnt=0;
		int mid = N/2;
		for(int i=min+4000; i<=max+4000; i++) {
			if(arr[i]>0) {
				cnt+=arr[i];
				if(cnt>=mid) {
					sb.append(i-3999).append("\n"); // 2 중앙값
					break;
				}
			}
		}
		
		
		sb.append(max-min).append("\n"); // 4 범위
		
		System.out.println(sb);
		
//		int[] arr = new int[N];
//		int sum = 0;
//		for(int i=0; i<N; i++) {
//			int t = Integer.parseInt(br.readLine());
//			arr[i]=t;
//			sum += t;
//		}
//		sb.append((int) Math.round((1.0*sum)/N)).append("\n"); // 1 산술평균
//		
//		Arrays.sort(arr);
//		sb.append(arr[N/2]).append("\n"); // 2 중앙값
//		
//		List<Integer> list = new ArrayList<>();
//		int maxCount = 0;
//		int count=1;
//		int pre = arr[0];
//		list.add(pre);
//		for(int i=1; i<N; i++) {
//			if(pre!=arr[i]) {
//				if(count>maxCount) {
//					maxCount=count;
//					list.clear();
//					list.add(pre);
//				}else if(count==maxCount) {
//					list.add(pre);
//				}
//				
//				pre = arr[i];
//				count=1;
//			}
//			else {
//				count++;
//			}
//		}
//		if(count>maxCount) {
//			list.clear();
//			list.add(pre);
//		}else if(count == maxCount) {
//			list.add(pre);
//		}
//		
//		int thirdAns=0;
//		if(list.size()>1) thirdAns = list.get(1);
//		else thirdAns = list.get(0);
//		
//		sb.append(thirdAns).append("\n"); // 3 최빈값
//		sb.append(arr[N-1]-arr[0]); // 4 범위
//		System.out.println(sb);
		
	}
}
