package JAVA_PROGRAMS_04_09_2024.Pattern.Number_pattern;

public class Number_pattern_2 {
    public static void main(String[] args) {
        int n =5;
        for (int i=1,p=1;i<=n;i++,p++){
            for(int j=1;j<=i;j++){
                System.out.print(p+"");
            }
            System.out.println();
        }
    }
}
