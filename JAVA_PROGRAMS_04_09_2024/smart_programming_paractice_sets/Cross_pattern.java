package JAVA_PROGRAMS_04_09_2024.smart_programming_paractice_sets;

public class Cross_pattern {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if((i==j)|| i+j==6){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
