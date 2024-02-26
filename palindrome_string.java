import java.util.Scanner;

public class palindrome_string {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string :");
        String str = sc.next();
        String org_str = str;
        String rev= "";
        int len= str.length();
        //System.out.println(len);
        for(int i=len-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed string is" +rev);

        if (org_str.equals(rev)){
            System.out.println(org_str+" "+ "is an palindrome string ");
        }  else{
            System.out.println(org_str+" "+ "is not an palindrome string ");
        }


    }
}
