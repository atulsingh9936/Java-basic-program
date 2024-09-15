package JAVA_PROGRAMS_04_09_2024.loop;

public class Loop_9 {
    public static void main(String[] args) {
        // continue -> if this is true continue

        for(int i=1;i<10;i++){
            System.out.println(i);
            if(i==5){
                continue;
            }
            System.out.println("After!!");
        }
    }
}
