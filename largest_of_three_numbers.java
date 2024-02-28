import java.util.Scanner;

public class largest_of_three_numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter Second number:");
        int b = sc.nextInt();
        System.out.println("Enter Third number:");
        int c = sc.nextInt();

//        if(a>b && a>c) {
//            System.out.println(a + " which is  a is largest number");
//        }
//            else if (b>a && b>c) {
//            System.out.println(b + "  which is b is largest number");
//        }
//            else{
//            System.out.println(c + " which is c is largest number");
//        }

        // using ternary operator

//        int largest1 = a>b?a:b;
//        int largest2 = c>largest1?c:largest1;

      //  int largest2 = c>largest1?c:largest1;
        int largest = c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println("The largest among a,b and c is " + largest );

            }
        }



