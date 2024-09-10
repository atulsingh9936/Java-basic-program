package JAVA_PROGRAMS_04_09_2024;

public class String_practice {
    public static void main(String[] args) {
      // string is an object that represents sequence of characters

        // how to create string in two ways
        // string literal
        // new keyword


//        // string literal
//        String s = "Rahul shetty academy";
//        String s1 = "Rahul shetty academy";
//
//        // new keyword
//
//        String s2 = new String("Welcome");
//        String s3= new String("Welcome");


        String s = "Rahul shetty academy";
    // String [] splittedstring=  s.split(" ");
//        String [] splittedstring=  s.split("shetty");
//        System.out.println(splittedstring[0]);
//        System.out.println(splittedstring[1]);
//      //  System.out.println(splittedstring[2]);
//        System.out.println(splittedstring[1].trim());
//        for(int i=0; i<s.length();i++){
//            System.out.println( s.charAt(i));

        for(int i = s.length()-1;i>=0;i--){
            System.out.println(s.charAt(i));
        }
//        }


    }
}
