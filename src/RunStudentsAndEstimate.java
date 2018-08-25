import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RunStudentsAndEstimate {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0]=new Student("Иванов", 2000);
        students[1]=new Student("Петров", 1999);
        students[2]=new Student("Васечкин", 1995);
        students[3]=new Student("Хризантемов", 2002);
        students[4]=new Student("Саддах", 2001);
        students[5]=new Student("Кандиба", 2000);
        students[6]=new Student("Куско", 1998);
        students[7]=new Student("Примакин", 1999);
        students[8]=new Student("Зачемтебе", 1996);
        students[9]=new Student("Заремба", 2000);

        //students.toString();
        System.out.println(Arrays.toString(students));
    }


}
