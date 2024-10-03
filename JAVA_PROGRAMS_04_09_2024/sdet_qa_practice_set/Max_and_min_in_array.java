package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class Max_and_min_in_array {
    public static void main(String[] args) {
      /*  int[] a ={50,30,40,10,20};
        int max =a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Maximum element in array:"+max);*/

        int[] a ={50,30,40,10,20,5,1,10};
        int min = a[0];
        for(int i=1;i<a.length;i++){
            if (a[i] < min) {
                min = a[i];

            }
            }
        System.out.println("the  minimum element is:"+min);
        }
    }

