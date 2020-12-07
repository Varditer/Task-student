package com.company;

public class Student {

        private  String FirstName;
        private String LastName;
        private int Year;
        private String Gender;
        private Float Mark;

        public String getFirstName() {
                return FirstName;
        }

        public void setFirstName(String firstName) {
                FirstName = firstName;
        }

        public String getLastName() {
                return LastName;
        }

        public void setLastName(String lastName) {
                LastName = lastName;
        }

        public int getYear() {
                return Year;
        }

        public void setYear(int year) {
                Year = year;
        }

        public String getGender() {
                return Gender;
        }

        public void setGender(String gender) {
                Gender = gender;
        }

        public Float getMark() {
                return Mark;
        }

        public void setMark(float  mark) {
                Mark = mark;
        }
}
