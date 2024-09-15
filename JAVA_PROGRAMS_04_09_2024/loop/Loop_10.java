package JAVA_PROGRAMS_04_09_2024.loop;

public class Loop_10 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println("Even -> "+i);
                continue;
            }
            System.out.println("odd -> "+i);
        }
    }
}
