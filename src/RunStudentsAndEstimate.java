import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RunStudentsAndEstimate {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0]=new Student("Кандиба", 2000);
        students[1]=new Student("Куско", 1998);
        students[2]=new Student("Примакин", 1999);


        System.out.println(Arrays.toString(students));

        Estimation estimation = new Estimation();
        estimation.receiptOfEstimation(students);
    }


}
