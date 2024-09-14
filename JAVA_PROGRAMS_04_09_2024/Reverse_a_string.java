package JAVA_PROGRAMS_04_09_2024;

import javax.management.MBeanAttributeInfo;

public class Reverse_a_string {
    public static void main(String[] args) {
// 1. using +(String concatenation) operator
        String str = "ABCD";
       String rev = "";
//        int len = str.length();
//      //  System.out.println(len);
//
//        for(int i=len-1;i>=0;i--){
//            rev = rev+str.charAt(i);
//
//
//        }
//        System.out.println("Reversed String is" +" "+ rev);

        // 2. using character array

//        char a[] = str.toCharArray();
//        int len = a.length;
//
//        for(int i= len-1;i>=0;i--){
//            rev = rev+a[i];
//        }
//        System.out.println(rev);


        //3. using string buffer class

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());




    }
}
