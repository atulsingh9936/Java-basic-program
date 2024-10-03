package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class Missing_number_in_array {
    public static void main(String[] args) {

        // array should not contains duplicate value
        // array : no need to be sorted order

        int  a[] = {1,2,4,5};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum = sum+a[i];
        }
        System.out.println("Sum of elements in array:"+sum);

        int sum1=0;
        for(int i=1;i<=5;i++){
            sum1 = sum1+i;
        }

        System.out.println("Sum of range of elements in array:"+sum1);
        System.out.println("Missing number is:"+(sum1-sum));


    }
}
