import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();


       // int num=9;
        int counter=0;

        if(num>1){

            for(int i=1;i<=num;i++){

                if (num%i==0)
                    counter++;
            }
            if (counter==2){
                System.out.println(num +" is prime number");
            }else {
                System.out.println("number is not prime");
            }

        }

        else{
            System.out.println("Not a prime number");
        }

    }
}
