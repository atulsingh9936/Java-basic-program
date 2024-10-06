package JAVA_PROGRAMS_04_09_2024.Basic_programs;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        int num =2;
        int count =0;
        for(int i=1;i<=num;i++) {
            if (num % i == 0) {
                count++;
            }
        }
            if(count==2){
                System.out.println("prime number:"+num);
            }else{
                System.out.println("not a prime number:"+num);
            }
        }
    }

