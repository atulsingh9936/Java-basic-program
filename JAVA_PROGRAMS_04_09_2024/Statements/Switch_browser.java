package JAVA_PROGRAMS_04_09_2024.Statements;

import java.util.Locale;
import java.util.Scanner;

public class Switch_browser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name where you want to execute your program");

        String browserName = sc.nextLine();
        browserName= browserName.toLowerCase();
        switch(browserName){
            case "chrome":
                System.out.println("Starting the chrome browser");
                // futher code to start the chrome

                break;

            case "Firefox":
                System.out.println("Starting the Firefox browser");
                // futher code to start the chrome
                break;

            case "edge":
                System.out.println("Starting the edge browser");
                // futher code to start the chrome
                break;
            default:

                System.out.println("I have no idea which browser is this");
        }
    }
}
