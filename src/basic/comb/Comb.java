package basic.comb;

public class Comb {
	
	static int COUNT;
	static int[] src = {1,2,3,4,5};
	
	public static void main(String[] args) {
		int length = src.length;
		
		for(int i=0; i<length; i++) {
			for(int j=i+1; j<length; j++) {
				for(int k=j+1; k<length; k++) {
					System.out.println(src[i]+" "+ src[j]+" "+ src[k]);
				}
			}
		}
	}
}
