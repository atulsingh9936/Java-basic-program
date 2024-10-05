package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class Count_of_even_odd_number_array {
    public static void main(String[] args) {
        int arr[]={10,20,112,45,67,3,17,73};
        int even_count =0;
        int odd_count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even_count++;

            }else{
                odd_count++;
            }

        }
        System.out.println(even_count);
        System.out.println(odd_count);
    }
}
