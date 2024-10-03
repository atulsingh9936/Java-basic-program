package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

import java.util.HashSet;

public class duplicate_hashset {
    public static void main(String[] args) {
        String[] arr ={"java","python","Ruby","perl","Java"};
        boolean flag = false;
        HashSet<String>langs = new HashSet();
        for(String l:arr){
            if(langs.add(l)==false){
                System.out.println("found duplicate element:"+l);
                flag=true;
            }
        }

        if(flag== false){
            System.out.println("no duplicate element found");
        }


    }
}
