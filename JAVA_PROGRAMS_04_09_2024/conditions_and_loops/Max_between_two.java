package JAVA_PROGRAMS_04_09_2024.conditions_and_loops;

import java.util.Scanner;

public class Max_between_two {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter Secondnumber");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(" first Number "+num1+"is greater");
        }else{
            System.out.println(" Second Number "+num2+"is greater");
        }

    }
}
