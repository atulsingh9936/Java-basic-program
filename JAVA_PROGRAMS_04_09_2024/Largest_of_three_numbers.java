package JAVA_PROGRAMS_04_09_2024;

public class Largest_of_three_numbers {
    public static void main(String[] args) {

        int a =10;
        int b =45;
        int c =56;

        int result=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(result);


    }
}
