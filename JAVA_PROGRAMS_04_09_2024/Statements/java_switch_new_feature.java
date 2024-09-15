package JAVA_PROGRAMS_04_09_2024.Statements;

public class java_switch_new_feature {
    public static void main(String[] args) {
        int itemcode= 001;

        switch (itemcode){
            case 001-> System.out.println("Its a laptop");
            case 002-> System.out.println("It is an desktop");
            case 003,004-> System.out.println("its is an mobile phone");
            default-> System.out.println("hello");

        }

        char ch ='e';
        switch (ch){
            case 'a','e','i','o','u'-> System.out.println("Its a vowel");
            default-> System.out.println("consonant");

        }
    }
}
