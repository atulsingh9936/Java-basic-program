package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class Printing_even_an_odd_Array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        System.out.println("even number in array:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.print(a[i]+" ");
            }

        }
        System.out.println();
        System.out.println("odd number in array:");
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.print(a[i]+" ");
            }
        }
    }
}
