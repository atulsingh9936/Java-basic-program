package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class sum_of_element_array {
    public static void main(String[] args) {
        int sum=0;
        int [] a ={1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            sum = sum+a[i];
        }
        System.out.println(sum);

    }
}
