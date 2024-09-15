package JAVA_PROGRAMS_04_09_2024.conditions_and_loops;

import java.util.Scanner;

public class else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if(number>20){
            System.out.println("num > 20");
        } else if (number>10) {
            System.out.println("num is between 10 and 20");

        }else {
            System.out.println("num is less than 20");
        }
    }
}
