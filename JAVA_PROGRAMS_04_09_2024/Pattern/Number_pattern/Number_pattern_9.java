package JAVA_PROGRAMS_04_09_2024.Pattern.Number_pattern;

public class Number_pattern_9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            int p=1;
            for(int j=i;j<=n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<i;j++){
                System.out.print(p++ +" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(p-- +" ");
            }
            System.out.println();
        }
    }
}
