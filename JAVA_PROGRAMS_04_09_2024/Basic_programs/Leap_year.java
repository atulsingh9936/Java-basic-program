package JAVA_PROGRAMS_04_09_2024.Basic_programs;

public class Leap_year {
    public static void main(String[] args) {

        int year = 2100;
        if(year%400==0 ||year%100!=0 && year%4==0){
            System.out.println("leap year");
        }else{
            System.out.println("not leap year");
        }
    }
}
