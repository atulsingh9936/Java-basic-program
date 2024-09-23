package JAVA_PROGRAMS_04_09_2024.Apna_college_Practice_set;

public class Half_Pyramid {
    public static void main(String[] args) {
        int n =4;
        for(int i=1;i<=n;i++){
            for(int j =1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
