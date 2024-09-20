package JAVA_PROGRAMS_04_09_2024.Pattern.Pattern_practice_18_09_2024;

public class Hill_pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println( );
        }

    }
}
