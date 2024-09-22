package JAVA_PROGRAMS_04_09_2024.Pattern.Charcater_pattern;

public class Increasing_column {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
         int p='A';
            for(int j=1;j<=i;j++){
                System.out.print((char)p++ +" ");
            }
            System.out.println();
        }
    }
}
