package JAVA_PROGRAMS_04_09_2024;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a button ");
        int button = sc.nextInt();

        switch (button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
                break;

                case 3: System.out.println("Bonjour");
                break;

                default:
                System.out.println("invalid button");
        }
    }
}