package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class duplicate {
    public static void main(String[] args) {
        String [] arr={"Java","Ruby","Python","Nodejs","Java"};
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   System.out.println("element found");
                   flag= true;

               }
            }
        }
        if(flag==false){
            System.out.println("element not found");
        }
    }
}
