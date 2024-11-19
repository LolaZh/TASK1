package org.example;

public class While {

    public static void main(String[] args) {

        String fullName = "Lolita Zhvania";// შემოვიტანე სტრინგ ტიპის ცვლადი

        int i = 2;// პოზიციის განსაზღვრა, საიდან დაიწყოს სიმბოლოების ათვლა
        while (i<fullName.length()){ //გამოვიყენე while ციკლი და ტექსტის სიგრძის განმს.მეთოდი , რათა გადაუაროს მთლიან ტექსტს)
            System.out.println(fullName.charAt(i));
            char currentChar = fullName.charAt(i); //შემოვიტანე ახალი ცვლადი
            if(Character.isLowerCase(currentChar)) { // გამოვიყენე სტრინგის ქვეს არსებული მეთოდი,სიმბოლოების პატარა ასოებზე შესამოწმებლად
                break;
            }
            i= i+3; //ინკრემენტი ყოველი მესამე სიმბოლოს დასაბეჭდად,თუ პატარა ასო არ მოიძებნა
        }

    }
}