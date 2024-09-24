package JAVA_PROGRAMS_04_09_2024.Apna_college_Practice_set;

public class Palindrome_pyramid {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
