import java.util.ArrayList;
import java.util.Scanner;

public class RunStudentsAndEstimate {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Введите список студентов по маске: фамилия, год рождения");
        Scanner scanner = new Scanner(System.in);
        students.add(new Student(scanner.next(), scanner.nextInt()));
    }
}
