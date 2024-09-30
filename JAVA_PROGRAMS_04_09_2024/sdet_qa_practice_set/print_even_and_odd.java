package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class print_even_and_odd {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6};
        int evencount =0;
        int oddcount=0;

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]+"is even number");
                evencount++;
            }else{
                System.out.println(a[i]+"is odd number");
                oddcount++;

            }

        }
        System.out.println("Total even count"+" "+evencount);
        System.out.println("Total odd count"+" "+oddcount);

    }
}
