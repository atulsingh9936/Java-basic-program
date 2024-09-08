package JAVA_PROGRAMS_04_09_2024;

public class swaptwonumbers_withoutthirdvariable {
    public static void main(String[] args) {
     // input x=10,y=20;
        //output x=20,y=10;

        int x=10;
        int y=20;

        x= x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
        System.out.println(y);

    }
}
