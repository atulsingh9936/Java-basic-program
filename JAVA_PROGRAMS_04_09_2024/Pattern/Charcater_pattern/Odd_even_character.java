package JAVA_PROGRAMS_04_09_2024.Pattern.Charcater_pattern;

public class Odd_even_character {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print("B ");
                }
                else
                    System.out.print("A ");

            }
            System.out.println();
        }
    }
}
