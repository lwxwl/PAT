// test point 4 run timeout...
import java.util.Scanner;


public class basicLevel1038 {

	public static void main(String[] args) {

        int[] score = new int[101];
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
		scanner.nextLine();
        String[] input = scanner.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(input[i]);
			score[temp]++;
		}
		int k = scanner.nextInt();
		for (int i = 0; i < k - 1; i++) {
			int temp = scanner.nextInt();
			System.out.print(score[temp] + " ");
		}
		int finalTemp = scanner.nextInt();
		System.out.print(score[finalTemp]);
		scanner.close();
	}
}
