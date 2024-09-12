package JAVA_PROGRAMS_04_09_2024;

import java.sql.SQLOutput;

public class string {
    public static void main(String[] args) {

//        String s1 ="Pramod";
//        String s2="Pramod";
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
//
//
//        String s = new String("Atul");
//        String s11= new String("Atul");
//        System.out.println(s==s11);
//        System.out.println(s.equals(s11));

//        String s1 = "Pramod";
//        char c = s1.charAt(5);
//       boolean result= s1.contains("m");
//        boolean result1= s1.contains("i");
//        System.out.println(c);
//        System.out.println(result);
//        System.out.println(result1);
//       s1= s1.concat("dutta");
//        System.out.println(s1);

        String password ="Pramod123";
        String pass_u =password.toLowerCase();
        System.out.println(pass_u);
        System.out.println(password==pass_u);
        System.out.println(password.equals(pass_u));
        System.out.println(password.equalsIgnoreCase(pass_u));

        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf("d"));

    }
}
