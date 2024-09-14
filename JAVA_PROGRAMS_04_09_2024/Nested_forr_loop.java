package JAVA_PROGRAMS_04_09_2024;

public class Nested_forr_loop {
    public static void main(String[] args) {

        for(int i=1;i<=4;i++){

            System.out.println("outer loop started");
            for (int j=1;j<=4;j++)
            {
                System.out.println("Inner loop ");
            }
            System.out.println("outer loop finished");
        }
    }
}
