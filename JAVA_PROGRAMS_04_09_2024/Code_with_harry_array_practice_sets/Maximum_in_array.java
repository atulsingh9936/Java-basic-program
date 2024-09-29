package JAVA_PROGRAMS_04_09_2024.Code_with_harry_array_practice_sets;

public class Maximum_in_array {
    public static void main(String[] args) {
        int [] arr = {1,21,3,455,5,34,67};
        int max=0;
        for(int e:arr){
            if(e>max){
                max=e;
            }
        }
        System.out.println("the maximum value of element in this array  is: "+ max);

    }
}
