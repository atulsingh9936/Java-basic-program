package Rahulshetty_practice_java;

public class String2_reverse_string {
    public static void main(String[] args) {

        String s ="madam";
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            t=t+(s.charAt(i));
        }

        System.out.println(t);
        if(s==t){
            System.out.println("palindome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
