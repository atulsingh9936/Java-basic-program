public class String_Reverse {
    public static void main(String[] args) {
        // 1. using string concatenation operator.

       String str = "LCX";
        String rev= " ";
//        int len= str.length();
//        for(int i=len-1;i>=0;i--){
//            rev = rev+str.charAt(i);
//        }
//        System.out.println("Reversed string is"+rev);


        // 2. using character array

      /*  char a[]= str.toCharArray();
        int  len = a.length;
        for(int  i=len-1;i>=0;i--){
            rev = rev+a[i];
        }*/
        // 3.  using string buffer class

        StringBuffer sb = new StringBuffer(str);
        System.out.println( sb.reverse());


       // System.out.println("Reversed string is"+rev);
    }
}
