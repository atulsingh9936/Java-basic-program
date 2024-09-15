package JAVA_PROGRAMS_04_09_2024.conditions_and_loops;

import java.util.Scanner;

public class Traingle_classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side1, side2, side3, i will tell about the traingle");
        int side1= sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if((side1==side2)&& (side1==side3)&&(side2==side3)){
            System.out.println("Equilateral traiangle");
        } else if ((side1==side2) ||(side1==side3)||(side2==side3)){
            System.out.println("Iso");
            
        }else{
            System.out.println("Scalene");
        }

    }
}
