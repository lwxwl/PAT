import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class basicLevel1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();
        int[] n = new int[j];
        @SuppressWarnings("rawtypes")
        TreeSet[] treeSets = new TreeSet[j];
        for (int i = 0; i < j; i++) {
            n[i] = scanner.nextInt();
            treeSets[i] = new TreeSet<>(getNumber(n[i]));
        }
        scanner.close();

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < j; i++) {
            if (isMajor(n[i], treeSets, i)) {
                linkedList.add(n[i]);
            }
        }

        int[] array = new int[linkedList.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = linkedList.get(i);
        }

        Arrays.sort(array);

        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.print(array[0]);
    }

    public static boolean isMajor(int n, @SuppressWarnings("rawtypes") TreeSet[] treeSets, int index) {
        for (int i = 0; i < treeSets.length; i++) {
            if (i != index && treeSets[i].contains(n)) {
                return false;
            }
        }
        return true;
    }

    public static TreeSet<Integer> getNumber(int n) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {

                n = (3 * n + 1) / 2;
            }

            treeSet.add(n);
        }
        return treeSet;
    }
}