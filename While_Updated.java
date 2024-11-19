package org.example;

public class While_Updated {

    public static void main(String[] args) {

        String fullName = "Lolita Zhvania";
        char currentChar = 'z';
        int i = 2;
        while (i < fullName.length()) {
            System.out.println(fullName.charAt(i));
            if (fullName.charAt(i) == currentChar) {
                break;
            }
            i = i + 3;
        }
    }
}
