package JAVA_PROGRAMS_04_09_2024;

import java.util.Scanner;

public class odd_even_number {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check");
        n = sc.nextInt();
        if(n%2==0){
            System.out.println("the number is  even");

        } else{
            System.out.println("the number is odd");
        }

    }
}
