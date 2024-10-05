package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class Merge_two_array {
    public static void main(String[] args) {

        int a[]={10,20,30};
        int b[] ={40,50,60,70,80};
        int a_len= a.length;
        int b_len= b.length;
        int c_len = a_len+b_len;
        int [] c = new int[c_len];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[a.length+i]=b[i];
        }
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
