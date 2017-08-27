import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by lwxwl on 2017/8/25.
 */
public class advancedLevel1006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        Person person[] = new Person[m];

        for (int i = 0; i < m; i++) {
            person[i] = new Person(scanner.next(), scanner.next().split(":"), scanner.next().split(":"));
        }
        scanner.close();

        Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.signInTime, o2.signInTime);
                //if (o1.signInTime > o2.signInTime) {
                //    return 1;
                //} else {
                //    return -1;
                //}
            }
        });

        System.out.print(person[0].id + " ");

        Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.signOutTime, o2.signOutTime);
                //if (o1.signOutTime > o2.signOutTime) {
                //    return 1;
                //} else {
                //    return -1;
                //}
            }
        });

        System.out.print(person[person.length - 1].id);

    }
}

class Person {
    String id;
    int signInTime;
    int signOutTime;

    public Person(String id, String[] signInTime, String[] signOutTime) {
        this.id = id;
        this.signInTime = Integer.parseInt(signInTime[0] + signInTime[1] + signInTime[2]);
        this.signOutTime = Integer.parseInt(signOutTime[0] + signOutTime[1] + signOutTime[2]);
    }
}
