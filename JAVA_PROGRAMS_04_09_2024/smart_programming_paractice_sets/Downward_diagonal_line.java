package JAVA_PROGRAMS_04_09_2024.smart_programming_paractice_sets;

public class Downward_diagonal_line {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i>=2 && j>1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
