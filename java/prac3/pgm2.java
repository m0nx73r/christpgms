package prac3;

public class pgm2 {
	public static void main(String[] args) {
		int j=0;
		int[] num = {44, 192, 123, 99, 24, 90};
		int[] num2 = new int[num.length-1];
		
		for(int i=0; i<num.length;i++){
			if(num[i]!= 24){
				num2[j]=num[i];
				j++; 
			} 
		}

		num = num2;
		for(int i:num2){
			System.out.println(i);
		}
	}
}
