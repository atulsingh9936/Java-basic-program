package Arrays;

import java.util.Scanner;

public class Marks_2 {
    public static void main(String[] args) {

        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first subject marks");
        marks[0]= sc.nextInt();
        System.out.println("Enter your second subject marks");
        marks[1]= sc.nextInt();
        System.out.println("Enter your third subject marks");
        marks[2]= sc.nextInt();
        System.out.println("Enter your Fourth subject marks");
        marks[3]= sc.nextInt();
        System.out.println("Enter your Fifth subject marks");
        marks[4]= sc.nextInt();
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
