package JAVA_PROGRAMS_04_09_2024.conditions_and_loops;

import java.util.Scanner;

public class Grade_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a student score ");
        int score= sc.nextInt();
        char grade='f';
        if(score>=90 &&score <=100){
             grade='A';
        } else if (score>=80 && score<=89) {
            grade='B';
        } else if (score>=70 && score<=79) {
            grade='C';
        } else if (score>=60 &&score<=69) {
            grade='D';
        } else if (score>100) {
            System.out.println("invalid input");
        } else {
            grade='F';
        }
        System.out.println("You grade is --> "+ grade);


    }
}
