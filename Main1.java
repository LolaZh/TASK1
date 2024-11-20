package org.example;

public class Main1 {

        public static void main(String[] args) {
            hasTeen(1,20,12);
        }

        static void hasTeen(int age1, int age2, int age3) {
            if ((age1 >= 13 && age1 <= 19)||(age2 >= 13 && age2 <= 19)||(age3 >= 13 && age3 <= 19))
            {
                System.out.println("True");
            }
            else {
                System.out.println("False");

            }
        }
    }

