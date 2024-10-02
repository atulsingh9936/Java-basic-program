package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

import java.util.Arrays;

public class sorting_an_array {
    public static void main(String[] args) {
        int [] a ={100,600,200,400,500};
        System.out.println("Before sorting....");
     /*   for(int val:a){
            System.out.println(val);
        }*/
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sorting....");
        System.out.println(Arrays.toString(a));
    }
}
