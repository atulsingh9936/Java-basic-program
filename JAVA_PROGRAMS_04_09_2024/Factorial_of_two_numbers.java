package JAVA_PROGRAMS_04_09_2024;


public class Factorial_of_two_numbers {
    public static void main(String[] args) {

        int num = 5, factorial=1;

        for(int i=1;i<=num;i++ ){
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
