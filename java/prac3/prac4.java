package prac3;

public class prac4 {
	public static void main(String[] args) {
		char[] aditya = { 'a', 'b', 'c', 'h', 'r', 'i', 's', 't', 'n', 'w', 'x', 'y', 'z' };
		char[] threebca = new char[7];
		System.arraycopy(aditya, 2, threebca, 0, 6);
		System.out.println(String.valueOf(threebca));
	}
}
