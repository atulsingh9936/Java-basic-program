package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class missing {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("sum of lements of array is:"+sum);

        int sum1=0;
        for(int i=0;i<=5;i++){
            sum1= sum1+i;
        }
        System.out.println("the sum of element is array:"+sum1);
        System.out.println("the missing element in array is "+(sum1-sum));


    }
}
