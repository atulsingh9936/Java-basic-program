package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class Search_an_element_Linear_Search {
    public static void main(String[] args) {
        int []a={10,20,60,46,78};
        boolean status = false;
        int search_element = 10;
        for(int i=0;i<a.length;i++){
            if(a[i]==search_element){
                System.out.println("element found at"+" :"+i);
                status= true;
                break;
            }
        }
        if(status==false) {
            System.out.println("element not found");
        }

    }
}
