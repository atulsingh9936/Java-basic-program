package JAVA_PROGRAMS_04_09_2024.smart_programming_paractice_sets;

public class Pyramid_4 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<i*2;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
