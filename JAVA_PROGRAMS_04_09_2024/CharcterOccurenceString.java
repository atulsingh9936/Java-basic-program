package JAVA_PROGRAMS_04_09_2024;

public class CharcterOccurenceString {
    public static void main(String[] args) {

        String str = "java is Object oriented language";
        // jv is object oriented lnguge

        int result = str.length()-str.replaceAll("e","").length();

        System.out.println(result);
    }
}
