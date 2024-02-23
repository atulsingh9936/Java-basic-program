import java.util.Scanner;
public class odd_even_number {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();
        if (i%2 == 0) {
            System.out.println("The number is even number");
        }
            else{
                System.out.println("The number is odd number");

            }

        }
    }

