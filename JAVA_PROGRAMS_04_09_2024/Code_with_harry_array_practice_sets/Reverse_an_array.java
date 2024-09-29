package JAVA_PROGRAMS_04_09_2024.Code_with_harry_array_practice_sets;

public class Reverse_an_array {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<=n;i++){
            // swap a[i] and a[l-i-1]
            // a b temp
            // |4| |3| ||

            temp = arr[i];
            arr[i]= arr[l-i-1];
            arr[l-i-1]= temp;
        }

        for(int element : arr){
            System.out.print(element+" ");
        }
    }
}
