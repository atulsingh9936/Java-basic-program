package JAVA_PROGRAMS_04_09_2024.smart_programming_paractice_sets;

public class Hollow_pyramkid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int k=5;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<i*2;j++){
                if(j>1 && j<(i*2)-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
}
