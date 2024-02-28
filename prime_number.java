import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();


       // int num=9;
//        int counter=0;
//
//        if(num>1){
//
//            for(int i=1;i<=num;i++){
//
//                if (num%i==0)
//                    counter++;
//            }
//            if (counter==2){
//                System.out.println(num +" is prime number");
//            }else {
//                System.out.println("number is not prime");
//            }
//
//        }
//
//        else{
//            System.out.println("Not a prime number");
//        }

       // int num=3;
        int count=0;

        if (num > 1) {

            for(int i=1;i<=num;i++) {
                if (num % i == 0) {
                    count++;
                }
            }
                if(count==2){

                    System.out.println("prime number");
                } else{
                    System.out.println("Not a prime number");
                }


        }

        else {
            System.out.println("the no. is not a prime number");
        }

        }

    }

