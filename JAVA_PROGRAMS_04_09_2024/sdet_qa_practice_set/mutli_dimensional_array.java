package JAVA_PROGRAMS_04_09_2024.sdet_qa_practice_set;

public class mutli_dimensional_array {
    public static void main(String[] args) {
        int [][]a ={{100,200},
                    {300,400},
                    { 500,600}

        };

//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[0].length;j++){
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }

        for(int arr[]:a){
            for(int x:arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
