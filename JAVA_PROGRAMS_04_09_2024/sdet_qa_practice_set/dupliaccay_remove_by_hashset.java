package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

import java.util.HashSet;

public class dupliaccay_remove_by_hashset {
    public static void main(String[] args) {
        int arr[]={10,20,20,30,40,40,50,50};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }

        for(int num:hs){
            System.out.println(num);
        }
    }
}
