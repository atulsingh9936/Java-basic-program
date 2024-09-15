package JAVA_PROGRAMS_04_09_2024.Statements;

public class lab_086_new_feature {
    public static void main(String[] args) {


        int itemcode = 002;
        switch(itemcode){
            case 001,002,003:
                System.out.println("it is an electronic gadget");
                break;
            case 004,005,007:
                System.out.println("It is an mechnical gadget");
                break;
            default:
                System.out.println("none");

        }
    }
}
