package Algorithms.LonelyInteger;

public class Solution {

	private static int lonelyInteger(int[] a) {

		int result = 0;

		for (int i : a) {
			result = result ^ i;
		}

		return result;
	}

	public static void main(String[] args) {
		/*Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}*/
		int[] a = { 0, 0, 1, 2, 1 };
		System.out.println(lonelyInteger(a));
	}

}
