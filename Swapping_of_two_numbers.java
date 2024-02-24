public class Swapping_of_two_numbers {

    public static void main(String[] args) {
        int a=10; int b=20;
        System.out.println("Before swapping two variables: " +a+" "+b);
      //using third variable
//        int t=a;
//        a=b;
//        b=t;
//        System.out.println("After swapping the variables: " +a+" "+b);

        // logic + and -

//        a= a+b;  // a=10,b=20;
//        b= a-b; //a= 30-20 =10
//        a=a-b; //30-10 =20;


        // logic * and /
//        a= a*b; //10*20 =200
//        b=a/b; //200/20=10
//        a=a/b; //200/10

        //bitwise - bitwise XOR(^)
//        a=a^b; //10^20 =30
//        b=a^b; //30^20=10
//        a=a^b; //30/10=20

        //logic5: single statement.
        b=a+b-(a=b);



        System.out.println("After swapping the variables: " +a+" "+b);


    }
}
