package prac3;

public class pgm1 {

	public static void main(String[] args) {
		int[] arr = {10,39,56,74,24};
		int[] arr2 = new int[arr.length+1];
		int idx = 0;
		for(int i: arr) {
			arr2[idx] = i;
			idx++;
		}
		arr2[arr2.length -1] = 87;
		
		for(int i :arr2)
			System.out.println(i);
	}
}
