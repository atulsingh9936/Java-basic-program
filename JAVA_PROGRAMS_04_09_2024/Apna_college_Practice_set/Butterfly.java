package JAVA_PROGRAMS_04_09_2024.Apna_college_Practice_set;

public class Butterfly {
    public static void main(String[] args) {
        int n=5;
        //upper half
        for(int i=1;i<=n;i++){
            //1 st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2 nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--){
            //1 st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces = 2*(n-i);
            //spaces
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2 nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
