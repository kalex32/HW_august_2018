import java.util.Scanner;

class Estimation implements ListOfEstimation {
    private int estimation;

    @Override
    public void receiptOfEstimation(Student[] students) {
        Scanner scanner = new Scanner(System.in);
       // Student[] studentsEst = new Student[students.length];
        for (int i = 0; i < students.length; i++) {
            System.out.println("Введите оценку 1 для: " + students[i].getLastName());
            students[i].setEst1(scanner.nextInt());
            System.out.println("Введите оценку 2 для: " + students[i].getLastName());
            students[i].setEst2(scanner.nextInt());
            System.out.println("Введите оценку 3 для: " + students[i].getLastName());
            students[i].setEst3(scanner.nextInt());
            students[i].setAverageEst((students[i].getEst1()+students[i].getEst2()+students[i].getEst3())/3);

        }
    }
}
