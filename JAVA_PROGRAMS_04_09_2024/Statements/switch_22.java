package JAVA_PROGRAMS_04_09_2024.Statements;

import java.util.Scanner;

public class switch_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int num1 = sc.nextInt();
        System.out.println("Enter a first number");
        int num2 = sc.nextInt();

        char ch ='*';
        switch(ch){
            case '+':
            System.out.println(num1+num2);
            break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1*num2);
                break;
            default:
                System.out.println("dont perform any operations");

        }


    }
}
