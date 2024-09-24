package JAVA_PROGRAMS_04_09_2024.Apna_college_Practice_set;

public class Left_pascal {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=3;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
