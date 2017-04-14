import java.util.Scanner;

public class basicLevel1006 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int array[] = new int[3];
        int i = 0;

        while (n != 0){
            array[i] = n % 10;
            n /= 10;
            i++;
        }
        for (int j = 0; j < array[2]; j++){
            System.out.print("B");
        }
        for (int k = 0; k < array[1]; k++){
            System.out.print("S");
        }
        for (int l = 1; l <= array[0]; l++){
            System.out.print(l);
        }
    }
}
