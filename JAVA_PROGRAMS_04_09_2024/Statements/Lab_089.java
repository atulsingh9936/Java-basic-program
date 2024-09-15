package JAVA_PROGRAMS_04_09_2024.Statements;

public class Lab_089 {
    public static void main(String[] args) {

        char code ='B';
        int val = switch (code){
            case 'A':
                yield 65;
            case'B':
                yield 66;
            default:
                System.out.println("Not able to find");
                throw new IllegalStateException("error");
        };
    }
}
