package JAVA_PROGRAMS_04_09_2024.smart_programming_paractice_sets;

public class Pyramid_2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=4;j>=1;j--){
                if(j>i){
                    System.out.print(" ");
                }else{
                    System.out.print(" *");
                }

            }
            System.out.println();
        }
    }
}
