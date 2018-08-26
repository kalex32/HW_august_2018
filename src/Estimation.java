import java.util.Scanner;

class Estimation implements ListOfEstimation {

    @Override
    public void receiptOfEstimation(Student[] students ) {
        Scanner scanner = new Scanner(System.in);
        for (Student i : students) {
            System.out.println("Введите оценку 1 для студента: " + i.getLastName() +", "+
                    i.getYearOfBirth() + " года рождения");
            i.setEst1(scanner.nextInt());
            System.out.println("Введите оценку 2 для студента: " + i.getLastName() +", "+
                    i.getYearOfBirth() + " года рождения");
            i.setEst2(scanner.nextInt());
            System.out.println("Введите оценку 3 для студента: " + i.getLastName() +", "+
                    i.getYearOfBirth() + " года рождения");
            i.setEst3(scanner.nextInt());
            i.setAverageEst(setAverageEst(i.getEst1(), i.getEst2(), i.getEst3()));

        }

        for (Student i:students) {
            System.out.println(i.toString());
        }
    }

    private double setAverageEst(double a, double b, double c) {
        double i = (a + b + c) / 3;
        System.out.println(i);
        i*=100;
        System.out.println(i);
        double f = Math.round(i);
        i=f/100;
        return i;
    }
}
