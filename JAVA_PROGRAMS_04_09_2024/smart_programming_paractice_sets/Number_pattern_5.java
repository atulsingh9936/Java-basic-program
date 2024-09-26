package JAVA_PROGRAMS_04_09_2024.smart_programming_paractice_sets;

public class Number_pattern_5 {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
