package JAVA_PROGRAMS_04_09_2024.Statements;

import java.util.Scanner;

public class Grade_with_switch {
    public static void main(String[] args) {

        // Program to check grade based on marks

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  your marks");

        int marks = sc.nextInt();
        // 90 ->90/10 -> 9-> A
        //87-> 87/10-> 8-> B
        // 77-> 77/10-> 7-> C

        marks= marks/10;
        System.out.println(marks);


        switch (marks){
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 1:
                System.out.println("F");
                break;
            default:
                System.out.println("none");
        }
    }
}
