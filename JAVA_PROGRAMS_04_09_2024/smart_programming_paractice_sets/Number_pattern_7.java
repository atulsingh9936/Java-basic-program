package JAVA_PROGRAMS_04_09_2024.smart_programming_paractice_sets;

public class Number_pattern_7 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int no=i;
            for(int j=1;j<=i;j++){
                System.out.print(no+" ");
                no= no+5-j;
            }
            System.out.println();

        }
    }
}
