import java.util.Scanner;

public class basicLevel1047 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] team = new int[1001];
        int max = 0;
        for (int i = 0; i < n; i++) {
            String[] score = scanner.next().split("[-]");
            int value = scanner.nextInt();
            int input = Integer.parseInt(score[0]);
            team[input] += value;

            if (team[input] > team[max]) {
                max = input;
            }
        }
        scanner.close();
        System.out.println(max + " " + team[max]);
    }
}

