package org.example;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // შემოვიტანე სკანერი იუზერის ინფუთის მისაღებად
        System.out.println("შეიყვანე რიცხვი"+":");
        int number = scanner.nextInt(); // დაბეჭდავს int ტიპის ინფუთს.
        checkNumber(number); //მეთოდის გამოძახება.

    }
    static void checkNumber(int number){ //main კლასში შევქმენი სტატიკური მეთოდი,რომელიც იღებს int ტიპის  ცვლადს.
        if (number == 0){
            System.out.println("ნოლი");}
        else if (number > 0) {
            System.out.println("დადებითი");}
        else {
            System.out.println("უარყოფითი");
        }

    }


}

