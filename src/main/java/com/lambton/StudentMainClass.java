package com.lambton;

        import java.time.LocalDate;
        import java.time.Month;
        import java.util.Arrays;

public class StudentMainClass
{
    public static void main(String[] args) {

        Student[] listOfStudents = new Student[2];

        //First Student Object
        LocalDate s1BirthDate =  LocalDate.of(1995, Month.JULY, 28);
        Student s1 = new Student(1,"Adithya","sai", s1BirthDate ,Gender.MALE,
                new float[]{50.0f, 100.0f, 40, 70, 60});

        listOfStudents[0] = s1;

        //NullPointerException
        // listOfStudents[0].printData();

        //Second Student Object
        LocalDate s2BirthDate =  LocalDate.of(1992, Month.MARCH, 25);
        Student s2 = new Student(2,"Pritesh","Patel", s2BirthDate ,Gender.MALE,
                new float[]{50.0f, 80.0f, 50, 70, 60});

        listOfStudents[1] = s2;

        for(Student s: listOfStudents)
        {
            s.calculateTotalMarks();
            s.calculatePercentage();
            s.calculateResult();
            s.printData();
        }
        Arithmetic arithmetic=new Arithmetic();
        System.out.println(arithmetic.add(5,6));

    }
}
