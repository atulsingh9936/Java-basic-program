package Arrays;

public class double_an_array {
    public static void main(String[] args) {
        int [] array1={2,4,7,90};
        int [] array2 = new int[4];
        for (int i=0;i<array1.length;i++){
            array2[i] = array1[i]*2;
            System.out.println(array2[i]);

        }
    }
}
