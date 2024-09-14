package JAVA_PROGRAMS_04_09_2024;

public class Inverted_pyramid_logic {
    public static void main(String[] args) {
        int k=1;
        for (int i=1;i<5;i++){
            for(int j=1; j<=i;j++){
                System.out.print(k);
                System.out.print("\t");
                k++;
            }
            System.out.println(" ");
        }
    }
}
