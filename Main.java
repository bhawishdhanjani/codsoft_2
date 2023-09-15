package com.codsofttask2;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many Subject You Have");
        int noOfSubject;
        while (true) {
            noOfSubject = scanner.nextInt();
            if (noOfSubject < 0)
                System.out.println("Enter the Correct Input");
            else
                break;
        }
        Float[] subjectMarks = new Float[noOfSubject];
        for (int i = 0; i < subjectMarks.length; i++) {
            System.out.println("Enter Subject "+(i+1)+" Mark");
            while (true){
                subjectMarks[i] = scanner.nextFloat();
                if (subjectMarks[i]<0 || subjectMarks[i]>100)
                    System.out.println("Enter Valid Input");
                else
                    break;
            }
        }
        float sum = Arrays.stream(subjectMarks).reduce((float) 0, Float::sum);
        float average = sum/noOfSubject;
        String grade = new FindGrade().findGradeByAverage(average);
        System.out.println("Your Subject Average is " + average);
        System.out.println("Your Grade is "+grade);

    }
}
