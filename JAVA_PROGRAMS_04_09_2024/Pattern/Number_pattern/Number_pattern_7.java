package JAVA_PROGRAMS_04_09_2024.Pattern.Number_pattern;

public class Number_pattern_7 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int p=5;
            for(int j=1;j<=i;j++){
                System.out.print(p-- +" ");
            }
            System.out.println();

        }
    }
}
