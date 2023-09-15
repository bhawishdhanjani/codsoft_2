package com.codsofttask2;

public class FindGrade {
    public String findGradeByAverage(float average){

        String grade ;
        if(average >= 97)
            grade = "A+";
        else if (average>=93)
            grade ="A";
        else if (average>=90)
            grade ="A-";
        else if (average>=87)
            grade ="B+";
        else if (average>=83)
            grade ="B";
        else if (average>=80)
            grade ="B-";
        else if (average>=77)
            grade ="C+";
        else if (average>=73)
            grade ="C";
        else if (average>=70)
            grade ="C-";
        else if (average>=67)
            grade ="D+";
        else if (average>=63)
            grade ="D";
        else if (average>=60)
            grade ="D-";
        else
            grade = "F";

        return grade;
    }
}
