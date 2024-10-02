package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class Find_how_may_duplicate {
    public static void main(String[] args) {
        int [] a ={100,200,100,300,100,200};
        int num =100;
        int count =0;

        for(int val:a){
            if(num==val){
                count++;
            }
        }
        System.out.println(count);
    }
}
