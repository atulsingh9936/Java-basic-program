package JAVA_PROGRAMS_04_09_2024;

public class String_practice_2 {
    public static void main(String[] args) {


//        String name = "JACK Parker";
//        name = name .toLowerCase();
//        System.out.println(name);



        String text = "To Lower case";
        text = text.replace(" ","_");
        System.out.println(text);


        String letter = "Dear <|name|>, thanks a lot";
        letter = letter.replace("<|name|>","harry");
        System.out.println(letter);

        String mystring = "This string contains   double and triple characters";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));



        String myletter = "Dear Harry,\n\tThis java course is nice.\nThanks";
        System.out.println(myletter);











    }
}
