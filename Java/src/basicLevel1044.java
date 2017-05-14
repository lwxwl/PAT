import java.util.Scanner;


public class basicLevel1044 {

	public static void main(String[] args) {

		String num[] = {"tret", "jan", "feb", "mar", "apr", "may", "jun", "jly", "aug", "sep", "oct", "nov", "dec"};
		String high[] = {"0", "tam", "hel", "maa", "huh", "tou", "kes", "hei", "elo", "syy", "lok", "mer", "jou"};

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String number[] = new String[n];
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			String str = scanner.nextLine();
			if (str.charAt(0) <= '9' && str.charAt(0) >= '0') {
				Integer integer = new Integer(str);
				if (integer / 13 > 0) {
					number[i] = high[integer / 13];
				}
				if (integer == 0) {
					number[i] = "tret";
					continue;
				}
				if (integer % 13 == 0) {
					continue;
				}
				if (number[i] != null) {
					number[i] = number[i] + " " + num[integer % 13];
				} else {
					number[i] = num[integer % 13];
				}
			} else {
				Integer f = 0;
				for (int j = 1; j < 13; j++) {
					if (str.contains(high[j])) {
						f = j * 13;
						break;
					}
				}
				for (int j = 0; j < 13; j++) {
					if (str.contains(num[j])) {
						f += j;
						break;
					}
				}
				number[i] = f.toString();
			}
		}
		for (String s : number) {
			System.out.println(s);
		}
	}
}
