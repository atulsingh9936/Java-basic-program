package Arrays;

public class Array_2d_2 {
    public static void main(String[] args) {
        int [][] array_2d = {
                {34,67,23},
                {23,12,45}
        };

        int row = array_2d.length;
        //System.out.println(row);
        for(int i=0;i<row;i++){
            for(int j=0;j<array_2d[i].length;j++){
                System.out.println(array_2d[i][j]);
            }
        }
    }
}
