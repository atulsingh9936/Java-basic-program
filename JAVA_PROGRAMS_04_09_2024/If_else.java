package JAVA_PROGRAMS_04_09_2024;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      //  System.out.println("enter a age");
        System.out.println("enter a number");
        int n = sc.nextInt();
/*
        if(age>=18){
            System.out.println("Adult");
        }else{
            System.out.println("Not an adult");
        }*/

        if(n%2==0){
            System.out.println("even number");
        } else{
            System.out.println("odd number");
        }



    }
}
