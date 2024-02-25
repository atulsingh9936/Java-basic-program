import java.util.Scanner;
public class Reverse_a_number

{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num =sc.nextInt();
      // 1. using algorithm
//        int rev=0;
//        while(num!=0){
//
//            rev=rev*10+ num%10;
//            num=num/10;

        // 2. using string buffer class method

        /*StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer  rev = sb.reverse();*/
//        System.out.println("reverse number is :" + rev);

        // 3. using string builder

        StringBuilder sbl= new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();


        System.out.println("reverse number is :" + rev);


    }
}
