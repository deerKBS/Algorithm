package BOJ.class3;

import java.io.*;

public class BOJ_1541 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int count = 1; // 가장 처음은 숫자라는 조건으로 인해 1로 설정
		for(char c : str.toCharArray()) {
			if(c=='-') break;
			else if(c=='+') count++;
		}
		
		String[] strList =str.split("[-+]");
		int ans = 0;
		
		for(int i=0; i<count; i++) {
			ans+=Integer.parseInt(strList[i]);
		}
		for(int i=count; i<strList.length; i++) {
			ans-=Integer.parseInt(strList[i]);
		}
		System.out.println(ans);
	}
}
