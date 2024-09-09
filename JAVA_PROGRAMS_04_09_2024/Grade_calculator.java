package JAVA_PROGRAMS_04_09_2024;

public class Grade_calculator {
    public static void main(String[] args) {
        int score = 35;
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        }else if (score >= 80 && score <= 89) {
             grade='B';
        } else if (score>=70&&score<=79) {
            grade='C';
        } else if (score>=60&&score<=69) {
            grade='D';
        } else{
            grade='F';
        }
        System.out.println("your grade is "+ grade);
            
        }
    }

