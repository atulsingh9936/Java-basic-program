package JAVA_PROGRAMS_04_09_2024.Pattern.Number_pattern;

public class Number_pattern_program_4 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                if (i % 2 == 0) {
                    System.out.print("2");
                } else
                    System.out.print("1");
            }
                System.out.println();


        }

    }
}
