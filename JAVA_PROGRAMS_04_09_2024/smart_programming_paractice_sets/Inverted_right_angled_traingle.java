package JAVA_PROGRAMS_04_09_2024.smart_programming_paractice_sets;

public class Inverted_right_angled_traingle {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
