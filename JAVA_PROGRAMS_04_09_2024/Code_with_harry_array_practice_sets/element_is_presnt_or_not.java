package JAVA_PROGRAMS_04_09_2024.Code_with_harry_array_practice_sets;

public class element_is_presnt_or_not {
    public static void main(String[] args) {
        float[] marks ={23.1f,67.5f,89.4f,90.5f,12.4f};
        float num = 89.4f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray=true;
                break;
            }
        }

        if(isInArray){
            System.out.println("The value is present in the array");
        }else{
            System.out.println("The value is not present in the array");
        }
    }
}
