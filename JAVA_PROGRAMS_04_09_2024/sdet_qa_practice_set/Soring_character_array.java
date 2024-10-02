package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

import java.util.Arrays;

public class Soring_character_array {
    public static void main(String[] args) {
       // char s[] ={'D','C','B','A'};
        String s[] ={"scott","marry","john","David"};
        System.out.println("Before sorting"+ Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After sorting"+Arrays.toString(s));
    }
}
