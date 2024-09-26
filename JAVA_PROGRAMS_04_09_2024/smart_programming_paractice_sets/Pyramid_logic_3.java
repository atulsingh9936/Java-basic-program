package JAVA_PROGRAMS_04_09_2024.smart_programming_paractice_sets;

public class Pyramid_logic_3
{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=2;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
