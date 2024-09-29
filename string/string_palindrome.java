package string;

import java.util.Scanner;

public class string_palindrome {
    public static void main(String[] args) {
        // palindrome - string
        //naman-> reverse -> namen
        //1331 -> 1331
        // malaylam
        //madam, mom

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string, i will check if it is palindrome or not");
        String Userinput = sc.next();

        StringBuffer sb = new StringBuffer(Userinput);
        String rev_user_input = sb.reverse().toString();
        if(Userinput.equalsIgnoreCase( rev_user_input)){
            System.out.println("string" +Userinput+" is palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
