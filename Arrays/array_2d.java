package Arrays;

public class array_2d {
    public static void main(String[] args) {


        int [][]  array_2d_2 = new int[3][3];

        // the default value is
        //|0,0,0|
        //|0,0,0|
        //|0,0,0|
        array_2d_2[0][0]= 34;
        //|34,0,0|
        //|0,0,0|
        //|0,0,0|
        array_2d_2[0][1]= 12;
        //|34,12,0|
        //|0,0,0|
        //|0,0,0|

        int [][]  array_2d ={
                {34,12,11},
                {34,12,34},
                {11,23,98}

        };

        for(int i=0;i<array_2d.length;i++){
            for(int j=0;j<array_2d[i].length;j++){
                System.out.println(array_2d[i][j]);
            }
        }

    }
}
