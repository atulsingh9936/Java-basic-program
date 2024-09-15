package JAVA_PROGRAMS_04_09_2024.Statements;

import java.util.Scanner;

public class pow_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x = sc.nextDouble();
        System.out.println("Enter the value of x");
        double y = sc.nextDouble();
        System.out.println("Enter the value of x");
        double z = sc.nextDouble();

        double result;

        // 3 /x^2+ Y^2-|z|
        // A+b-c, A -> x^2, B -> y^2, c -> |z|


        result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2))-Math.abs(z);
        System.out.println(result);
    }
}
