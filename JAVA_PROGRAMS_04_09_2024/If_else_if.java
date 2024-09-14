package JAVA_PROGRAMS_04_09_2024;

import java.util.Scanner;

public class If_else_if {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a = sc.nextInt();
        System.out.println("Enter a second number");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Equals");
        } else if (a>b) {
            System.out.println("a is greater");

        }else{
            System.out.println("a is lesser");
        }
    }
}
