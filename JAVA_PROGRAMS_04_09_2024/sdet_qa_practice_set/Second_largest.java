package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class Second_largest {
    public static void main(String[] args) {

        int [] arr={-1,7,1,34,18};
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest= largest;
                largest=arr[i];
            }
            if(arr[i]!=largest &&arr[i]>secondlargest){
                secondlargest=arr[i];
            }

        }
        System.out.println(secondlargest);

    }
}
