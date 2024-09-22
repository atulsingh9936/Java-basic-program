package JAVA_PROGRAMS_04_09_2024.Pattern.Charcater_pattern;

public class Increasing_traiangle_with_Decrementing_rows {
    public static void main(String[] args) {
        int n =5;
        for(int i=1,p='E';i<=n;i++,p--){
            for(int j=1;j<=i;j++){
                System.out.print((char)p+" ");
            }
            System.out.println();
        }
    }
}
