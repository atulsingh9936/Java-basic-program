package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class even_an_odd_in_a_number {
    public static void main(String[] args) {
        int num = 1234;
        int even_count =0;
        int odd_count=0;
        while(num>0){

            int rem = num%10;
            if(rem%2==0){
                even_count++;
            }else{
                odd_count++;
            }
            num = num/10;
        }
        System.out.println(even_count);
        System.out.println(odd_count);
    }
}
