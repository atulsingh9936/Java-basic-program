package JAVA_PROGRAMS_04_09_2024.Pattern;

public class Decreasing_traiangle_pattern {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=n;i++){
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
