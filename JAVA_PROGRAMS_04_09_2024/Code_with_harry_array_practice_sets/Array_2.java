package JAVA_PROGRAMS_04_09_2024.Code_with_harry_array_practice_sets;

public class Array_2 {
    public static void main(String[] args) {
      /*  int [] marks ={12,78,23,56,34};
        float [] marks ={12.1f,78.3f,23.5f,56.5f,34.3f};
        String[] students ={"Harry", "rohan","jagdish","shubham","omkar"};
        System.out.println(marks[0]);
        System.out.println(marks[3]);
        System.out.println(students.length);
        System.out.println(students[1]);*/

        int [] marks ={12,78,23,56,34};
      //  System.out.println(marks.length);
       /* System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);*/

       /* for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }*/
        for(int element:marks){
            System.out.println(element);
        }

    }
}
