import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class basicLevel1013 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        String[] prime = new String[max - min + 1];
        Map<Integer, Integer> primMap = new HashMap<>();
        int primeCount = 0;
        int count = 1;
        int j = 0;

        if (max < 80) {

            for (int i = 2; i <= 2147483647; i++) {
                if (isPrime(i)) {

                    primeCount++;
                    if (primeCount >= min) {
                        prime[j] = i + " ";
                        j++;
                    }
                    if (primeCount == max) {
                        break;
                    }
                }
            }

            for (int i = 0; i < prime.length; i++) {
                if (count == 10) {
                    count = 0;
                    System.out.print(prime[i].trim());
                    System.out.println();
                } else if (i == prime.length - 1) {
                    System.out.print(prime[i].trim());
                } else {
                    System.out.print(prime[i]);
                }
                count++;
            }

        } else {

            for (int i = 2; i <= 2147483647; i++) {
                if (isPrime(i, primMap)) {
                    primeCount++;
                    if (primeCount >= min) {
                        prime[j] = i + " ";
                        primMap.put(j, i);
                        j++;
                    }
                    if (primeCount == max) {
                        break;
                    }
                }
            }

            for (int i = 0; i < prime.length; i++) {
                if (count == 10) {
                    count = 0;
                    System.out.print(prime[i].trim());
                    System.out.println();
                } else if (i == prime.length - 1) {
                    System.out.print(prime[i].trim());
                } else {
                    System.out.print(prime[i]);
                }
                count++;
            }

        }
    }

    public static boolean isPrime(int a) {
        boolean flag = true;
        if (a < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {

                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public static boolean isPrime(int a, Map<Integer, Integer> primMap) {
        boolean flag2 = true;
        double sq = Math.sqrt(a);
        for (int i = 0; i < primMap.size(); i++) {
            if (i > sq) {
                break;
            }
            if (a % primMap.get(i) == 0) {
                flag2 = false;
            }
        }
        boolean flag = true;
        if (flag2) {
            if (a < 2) {
                return false;
            } else {
                for (int i = 2; i <= sq; i++) {
                    if (a % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        return flag && flag2;
    }
}

