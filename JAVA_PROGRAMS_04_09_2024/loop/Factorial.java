package JAVA_PROGRAMS_04_09_2024.loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // factorial program
        //1!-> 1
        // 2!-> 2*1
        //3!-> 3*2*1 -> 6
        // 4!-> 4*3*2*1-> 24
        // 5!-> 5*4*3*2*1 -> 120

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        long fact =1;
        for(int i=1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println(fact);
        sc.close();
    }
}
