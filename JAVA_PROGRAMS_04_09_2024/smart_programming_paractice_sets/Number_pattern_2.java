package JAVA_PROGRAMS_04_09_2024.smart_programming_paractice_sets;

public class Number_pattern_2 {
    public static void main(String[] args) {
        int n=5;
        int count =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                count = count+1;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
