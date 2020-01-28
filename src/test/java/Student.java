package com.lambton;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

enum Gender {
    MALE,
    FEMALE,
    OTHERS
}

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int ageInYear;
    private Gender gender;
    private float[] marks;
    private float totalMarks;
    private float percentage;
    private String result;


    public Student(int studentId, String firstName, String lastName, LocalDate birthDate, Gender gender, float[] marks) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.marks = marks;
        this.ageInYear = calculateStudentAge();
        this.gender = gender;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        this.ageInYear = this.calculateStudentAge();
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public int getAgeInYear() {
        return ageInYear;
    }

    public float getPercentage() {
        return percentage;
    }

    public String getResult() {
        return result;
    }

    public void printData() {
        System.out.println("Student id          : " + studentId);
        System.out.println("Student FirstName   : " + firstName);
        System.out.println("Student LastName    : " + lastName);
        System.out.println("Student Birth Date  : " + getFormattedBirthDate());
        System.out.println("Student Age (Years) : " + ageInYear);
        System.out.println("Student Gender      : " + gender);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("\tSubject " + (i + 1) + " : " + marks[i]);
        }
        System.out.println("Student Total Marks : " + totalMarks);
        System.out.println("Student Percentage  : " + percentage);
        System.out.println("Student Result      : " + result);

        //getAge();

    }

    private int calculateStudentAge() {
        int age;

        LocalDate today = LocalDate.now();
        age = today.getYear() - birthDate.getYear();

        return age;
    }

    public void calculateTotalMarks() {
        float total = 0.0f;
        for (float mark : marks) {
            total = total + mark;
        }

        this.totalMarks = total;
    }

    public void calculatePercentage() {
        this.percentage = this.totalMarks / 5.0f;
    }

    public void calculateResult() {
        this.result = this.percentage >= 50.0 ? "PASS" : "FAIL";
    }

    private String getFormattedBirthDate() {
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd MMM, yyyy");

        return this.birthDate.format(myFormatObj);
    }

    private void getAge() {
        LocalDate now = LocalDate.now();
        Period diff = Period.between(birthDate, now);
        System.out.println(diff.getYears() + " years, " + diff.getMonths() + " months, " + diff.getDays() + " days");
    }
}