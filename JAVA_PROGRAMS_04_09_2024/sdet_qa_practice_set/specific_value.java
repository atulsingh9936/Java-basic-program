package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class specific_value {
    public static void main(String[] args) {
        boolean check = false;
        int arr []={10,20,30,40,50};
        int find = 400;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==find){
                check= true;
                break;


            }
        }
        if(check){
            System.out.println("element is found");
        }else{
            System.out.println("element is not found");
        }
    }
}
