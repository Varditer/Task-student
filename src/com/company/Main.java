package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] strings = Files.readAllLines(Paths
                .get("C:/Users/Suren/Desktop/codsvard/Student/src/com/company/", "MyData.txt"))
                .toArray(new String[0]);

        Student[] students = new Student[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String[] s = strings[i].split(",");
            students[i] = new Student();
            students[i].FirstName = s[0];
            students[i].LastName = s[1];
            students[i].Year = Integer.parseInt(s[2]);
            students[i].Gender = s[3];
            students[i].Mark = Float.parseFloat(s[4]);
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println("The full name is: " + students[i].FirstName);
        }
        for (int i = 0; i < strings.length; i++) {
            if (students[i].Gender.equals("m")) {
                System.out.println(students[i].FirstName);
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (students[i].Mark > 50.4 && students[i].Gender.equals("f")) {
                System.out.println(students[i].FirstName);
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (students[i].Mark < 50.4) {
                System.out.println(students[i].FirstName + students[i].LastName + students[i].Year + students[i].Gender);
            }

        }
        int curentindex=0;
        int curentvalue=students[0].Year;
        for (int i = 1; i < strings.length; i++){
          if(students[i].Year > curentvalue){
              curentvalue=students[i].Year;
              curentindex=i;
          }

        }
        System.out.println(students[curentindex].FirstName + students[curentindex].LastName + students[curentindex].Year + students[curentindex].Gender + students[curentindex].Mark );

        for (int i = 0; i < students.length-1; i++) {
            for (int j = i+1; j < students.length; j++) {
                if(students[i].Mark > students[j].Mark ){
                    Student student = new Student();
                    student = students[i];
                    students[i]=students[j];
                    students[j]=student;

                }
            }

        }
        System.out.println("sorted by Mark");
        for (int i = 0; i < students.length ; i++) {
            System.out.println(students[i].FirstName);
        }
        for (int i = 0; i < students.length-1; i++){
            for (int j = i+1; j < students.length; j++){
                if(students[i].Year > students[j].Year){
                    Student student = new Student();
                    student = students[i];
                    students[i]=students[j];
                    students[j]=student;
                }

            }

        }
        for (int i = 0; i < strings.length; i++) {
            if (students[i].Gender.equals("f")) {
                System.out.println(students[i].FirstName);
            }
        }


    }
     
}

