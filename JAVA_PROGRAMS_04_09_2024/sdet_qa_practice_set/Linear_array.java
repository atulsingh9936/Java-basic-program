package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class Linear_array {
    public static void main(String[] args) {
        boolean status =false;
        int [] a ={10,20,30,40,50};
        int search_element = 20;
        for(int i=0;i<a.length;i++){
            if(a[i]==search_element){
                System.out.println("element found");
                status= true;
                break;
            }
            }
        if(status==false) {
            System.out.println("element not found");
        }
        }
    }
