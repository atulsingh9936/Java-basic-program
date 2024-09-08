package JAVA_PROGRAMS_04_09_2024;

public class Prime_Number_2 {
    public static void main(String[] args) {

        int num=18, count =0;
        for(int i=1;i<=num;i++) {
            if (num % i == 0) {
                count++;
            }
        }
            if(count==2){
                System.out.println("prime number");
            }else{
                System.out.println("number is not prime");
            }


    }
}
