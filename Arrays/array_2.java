package Arrays;

public class array_2 {
    public static void main(String[] args) {
      /*  2  4 5
        3 4  7
        1  2  3   */



        int abc[][]= {{2,4,5},{3,2,10},{1,2,0}};
        int min = abc[0][0];
        int mincolumn =0;

        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(abc[i][j]<min){
                    min= abc[i][j];
                    mincolumn=j;
                }

            }

        }
        int max=abc[0][mincolumn];
        int k=0;
        while(k<3){
            if(abc[k][mincolumn]>max){
                max = abc[k][mincolumn];
            }
            k++;
        }
        System.out.println(max);

    }
}
