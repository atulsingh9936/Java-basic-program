package JAVA_PROGRAMS_04_09_2024.Statements;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        // take a user input as char and tell the user if it is vowel
        //aeiou

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character and i will tell you if it is a vowel or not");

        char user_input= sc.next().charAt(0);
        System.out.println(user_input);

        switch (user_input){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case 'o':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonant");
        }
    }
}
