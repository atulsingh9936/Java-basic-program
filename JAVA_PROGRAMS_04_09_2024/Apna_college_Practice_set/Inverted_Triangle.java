package JAVA_PROGRAMS_04_09_2024.Apna_college_Practice_set;

public class Inverted_Triangle {
    public static void main(String[] args) {
        int n =4;
        for(int i=n;i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
