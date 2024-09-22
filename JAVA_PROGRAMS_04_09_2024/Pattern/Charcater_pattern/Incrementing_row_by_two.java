package JAVA_PROGRAMS_04_09_2024.Pattern.Charcater_pattern;

public class Incrementing_row_by_two {
    public static void main(String[] args) {
        int n =5;
        for(int i=1,p='A';i<=n;i++,p+=2){
            for(int j=1;j<=i;j++){
                System.out.print((char)p+" ");
            }
            System.out.println();
        }
    }
}
