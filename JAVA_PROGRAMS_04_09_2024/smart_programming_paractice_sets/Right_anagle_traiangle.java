package JAVA_PROGRAMS_04_09_2024.smart_programming_paractice_sets;

public class Right_anagle_traiangle {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=4;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
