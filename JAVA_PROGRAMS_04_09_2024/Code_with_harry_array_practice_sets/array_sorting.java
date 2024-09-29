package JAVA_PROGRAMS_04_09_2024.Code_with_harry_array_practice_sets;

public class array_sorting {
    public static void main(String[] args) {
        boolean is_sorted = true;
        int [] arr = {1,2100,3,445,5,34,67};
        for( int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                is_sorted= false;
                break;
            }
        }
        if(is_sorted){
            System.out.println("The array is sorted");
        }else{
            System.out.println("The array is not sorted");
        }
    }
}
