package JAVA_PROGRAMS_04_09_2024.Pattern;

public class Right_sided_trainagle_reverse {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println( );
        }
    }
}
