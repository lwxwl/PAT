// Time out at test points 2&3&4, I need my box of expressions ...
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class basicLevel1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int h = scanner.nextInt();

        Set<Student> setOne = new TreeSet<>();
        Set<Student> setTwo = new TreeSet<>();
        Set<Student> setThree = new TreeSet<>();
        Set<Student> setFour = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            int moral = scanner.nextInt();
            int talent = scanner.nextInt();

            if (moral >= l && talent >= l) {
                Student temp = new Student(id, moral, talent, h);
                switch (temp.classType) {
                    case 1:
                        setOne.add(temp);
                        break;
                    case 2:
                        setTwo.add(temp);
                        break;
                    case 3:
                        setThree.add(temp);
                        break;
                    case 4:
                        setFour.add(temp);
                        break;
                }
            }
        }
        scanner.close();


        System.out.println(setOne.size() + setTwo.size() + setThree.size() + setFour.size());
        for (Student s : setOne) {
            System.out.printf("%08d %d %d\n", s.id, s.moral, s.talent);
        }
        for (Student s : setTwo) {
            System.out.printf("%08d %d %d\n", s.id, s.moral, s.talent);
        }
        for (Student s : setThree) {
            System.out.printf("%08d %d %d\n", s.id, s.moral, s.talent);
        }
        for (Student s : setFour) {
            System.out.printf("%08d %d %d\n", s.id, s.moral, s.talent);
        }
    }
}

class Student implements Comparable<Student> {
    int id;
    int moral;
    int talent;
    int score;
    int classType;

    public Student(int id, int moral, int talent, int h) {
        this.id = id;
        this.moral = moral;
        this.talent = talent;
        this.score = talent + moral;

        if (moral >= h && talent >= h) {
            classType = 1;
        } else if (moral >= h && talent < h) {
            classType = 2;
        } else if (moral < h && talent < h && moral >= talent) {
            classType = 3;
        } else {
            classType = 4;
        }
    }

    @Override
    public int compareTo(Student s) {

        if (this.score < s.score) {
            return 1;
        } else if (this.score > s.score) {
            return -1;
        } else {
            if (this.moral < s.moral) {
                return 1;
            } else if (this.moral > s.moral) {
                return -1;
            } else {
                if (this.id > s.id) {
                    return 1;
                } else if (this.id < s.id) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

}

