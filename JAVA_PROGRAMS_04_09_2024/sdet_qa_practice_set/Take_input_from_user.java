package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

import java.util.Scanner;

public class Take_input_from_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println("given number is "+num);

    }
}
