package JAVA_PROGRAMS_04_09_2024.Statements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class switch_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1-7 , i will tell your day it is");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Only 1-7 numbers are allowed");
        }
        System.out.println("i will be executed anyhow");
    }
}
