package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) throws IOException {
        String[] strings = Files.readAllLines(Paths
                .get("C:/Users/Suren/Desktop/codsvard/Student/src/com/company/", "MyData.txt"))
                .toArray(new String[0]);

        Student[] students = new Student[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String[] s = strings[i].split(",");
            students[i] = new Student();
            students[i].setFirstName(s[0]);
            students[i].setLastName(s[1]);
            students[i].setYear( Integer.parseInt(s[2]));
            students[i].setGender(s[3]);
            students[i].setMark(Float.parseFloat(s[4]));
        }
        // Print full names of students
        for (int i = 0; i < strings.length; i++) {
            System.out.println("The full name is: " + students[i].getFirstName());
        }
        //Print all male students
        for (int i = 0; i < strings.length; i++) {
            if (students[i].getGender().equals("m")) {
                System.out.println(students[i].getFirstName());
            }
        }
        //Print all female students who has mark greater then 50.4
        for (int i = 0; i < strings.length; i++) {
            if (students[i].getMark() > 50.4 && students[i].getGender().equals("f")) {
                System.out.println(students[i].getFirstName());
            }
        }
        //Print student information having the minimal mark
        for (int i = 0; i < strings.length; i++) {
            if (students[i].getMark() < 50.4) {
                System.out.println(students[i].getFirstName() + students[i].getLastName() + students[i].getYear() + students[i].getGender());
            }

        }
        //Print biggest male student information
        int curentindex = 0;
        int curentvalue = students[0].getYear();
        for (int i = 1; i < strings.length; i++) {
            if (students[i].getYear() > curentvalue) {
                curentvalue = students[i].getYear();
                curentindex = i;
            }

        }
        System.out.println(students[curentindex].getFirstName() + students[curentindex].getLastName() + students[curentindex].getYear() + students[curentindex].getGender() + students[curentindex].getMark());
        //Print students sorted by mark
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getMark() > students[j].getMark()) {
                    Student student = new Student();
                    student = students[i];
                    students[i] = students[j];
                    students[j] = student;

                }
            }

        }
        System.out.println("sorted by Mark");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getFirstName());
        }
        //Print female students sorted by year
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getYear() > students[j].getYear()) {
                    Student student = new Student();
                    student = students[i];
                    students[i] = students[j];
                    students[j] = student;
                }

            }

        }
        for (int i = 0; i < strings.length; i++) {
            if (students[i].getGender().equals("f")) {
                System.out.println(students[i].getFirstName());
            }
        }
    }
}
