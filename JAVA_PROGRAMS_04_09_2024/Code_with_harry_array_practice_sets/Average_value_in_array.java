package JAVA_PROGRAMS_04_09_2024.Code_with_harry_array_practice_sets;

public class Average_value_in_array {
    public static void main(String[] args) {

        float[] marks ={23.1f,67.5f,89.4f,90.5f,12.4f};
        float sum=0;
        for(float element:marks){
            sum = sum+element;
        }
        System.out.println("the average value is "+sum/marks.length);
    }
}
