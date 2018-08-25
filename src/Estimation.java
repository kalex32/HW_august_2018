import java.util.Arrays;
import java.util.Scanner;

class Estimation implements ListOfEstimation {
    private int estimation;

    @Override
    public void receiptOfEstimation(Student[] students) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("Введите оценку 1 для студента: " + students[i].getLastName() +", "+
                    students[i].getYearOfBirth() + " года рождения");
            students[i].setEst1(scanner.nextInt());
            System.out.println("Введите оценку 2 для студента: " + students[i].getLastName() +", "+
                    students[i].getYearOfBirth() + " года рождения");
            students[i].setEst2(scanner.nextInt());
            System.out.println("Введите оценку 3 для студента: " + students[i].getLastName() +", "+
                    students[i].getYearOfBirth() + " года рождения");
            students[i].setEst3(scanner.nextInt());
            students[i].setAverageEst(setAverageEst(students[i].getEst1(), students[i].getEst2(), students[i].getEst3()));

        }
        System.out.println(Arrays.toString(students));
    }

    private double setAverageEst(int a, int b, int c) {
        final int i = (a + b + c) / 3;
        return i;
    }
}
