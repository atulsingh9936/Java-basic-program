package JAVA_PROGRAMS_04_09_2024.loop;

public class For_loop_7 {
    public static void main(String[] args) {
        System.out.println("print the value of i , bit i want to  break when i=5");
        for(int i=1;i<=10;i++){
            System.out.println("Value of "+i);
            if(i==5){
                break;
            }
          //  System.out.println("Value of"+i);
        }
        System.out.println("end of the program");
    }
}
