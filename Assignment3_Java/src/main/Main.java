package main;

import calculations.*;
import history.History;
import student.Addition;
import student.Student;
import java.util.*;

public class Main {

    public static void main(String []args)
    {
        History h = new History();

        // CALCULATIONS PACKAGE
        calculations.Addition add = new calculations.Addition();
        System.out.println(add.addition(2,3));
        System.out.println(add.addition(2.3,3.8));

        Subtraction sub = new Subtraction();
        System.out.println(sub.subtraction(10,7));
        System.out.println(sub.subtraction(3.5,7.2));

        Multiplication mul = new Multiplication();
        System.out.println(mul.multiplication(4,8));
        System.out.println(mul.multiplication(7.4,5.8));

        Division div = new Division();
        div.division(10,6);
        div.division(22,0);

        // HISTORY PACKAGE
        h.showHistory();

        // STUDENT AND ADDITION PACKAGE
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter no of subjects student has: ");
        int no_of_subs = sc.nextInt();
        System.out.println("Enter marks of each subject: ");
        float[] marks = new float[no_of_subs];
        for(int i=0;i<no_of_subs;i++)
            marks[i] = sc.nextFloat();

        Student stu = new Student(marks);
        Addition ad = new Addition();
        float total = ad.addition(stu.marks, stu.total);
        System.out.println("Total marks of student: "+total);

    }
}
