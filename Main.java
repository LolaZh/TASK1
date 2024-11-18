package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int [] numbers = {2, 8, 3, 5, 10,11,4,6}; //შემოვიტანეთ რიცხვების მასივი
        int evenNumbers = 0;

        for (int i = 0; i < numbers.length; i ++) { //გამოვიყენე for  ციკლი რათა გადავუარო ყველა ციფრს მასივში
            if (numbers[i] % 2 == 0) {     //შევამოწმოთ თითოეული რიცხვი მასივიდან უნაშთოდ იყოფა თუ არა 2-ზე
                evenNumbers++;//შემოვიტანეთ ინკრემენტი ლუწი რიცხვების დასათვლელად
            }
        }
            if (evenNumbers > 0) { //შედეგის გამოსაჩენად შემოვიტანე ორი პირობა
                System.out.println("მასივში არის " + evenNumbers + " ლუწი რიცხვი.");
            } else {
                System.out.println("მასივში არ არის ლუწი რიცხვი");
            }






        }
    }

