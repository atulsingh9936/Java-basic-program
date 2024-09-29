package Arrays;

public class arry_multiplication {
    public static void main(String[] args) {

        int[] array1={1,7,8};
        int[] array2=new int [3];

        for( int i=0;i<array1.length;i++){
            array2[i]= array1[i]*2;
            System.out.println(array2[i]);
        }

    }
}
