package JAVA_PROGRAMS_04_09_2024.smart_programming_paractice_sets;

public class Number_pattern_3 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
