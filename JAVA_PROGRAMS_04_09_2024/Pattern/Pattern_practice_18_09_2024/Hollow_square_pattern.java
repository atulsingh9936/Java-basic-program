package JAVA_PROGRAMS_04_09_2024.Pattern.Pattern_practice_18_09_2024;

public class Hollow_square_pattern {
    public static void main(String[] args) {
        int n =5;
       for(int i=1;i<=n;i++){
           for(int j=1;j<=n;j++){
               if(i==1|| j==1 ||i==n||j==n){
                   System.out.print("* ");
               }else{
                   System.out.print("  ");
               }
           }
           System.out.println();
       }
    }
}
