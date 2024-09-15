package JAVA_PROGRAMS_04_09_2024.Statements;

public class switch_3 {
    public static void main(String[] args) {
        byte b =20;
        switch(b){
            case 10:
                System.out.println("Ten");
                break;
            case 127:
                System.out.println("One twenty seven");
                break;
            default:
                System.out.println("default");
        }
    }
}
