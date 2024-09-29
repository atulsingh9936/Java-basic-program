package JAVA_PROGRAMS_04_09_2024.Code_with_harry_array_practice_sets;

public class add_two_matrices {
    public static void main(String[] args) {
        int [][] matrices1 = {{1,4,5},
                              {3,5,7}};
        int [][] matrices2 = {{2,6,13},
                              {9,1,3}};
        int [][] result ={{0,0,0},
                          {0,0,0}
        };

        for(int i=0;i<matrices1.length;i++){
            for(int j=0;j<matrices1[i].length;j++){
                System.out.format("setting value for i =%d and j=%d\n",i,j);
                result[i][j]= matrices1[i][j]+matrices2[i][j];
            }
        }

        for(int i=0;i<matrices1.length;i++){
            for(int j=0;j<matrices1[i].length;j++){
                System.out.print(result[i][j]+" ");
                //result[i][j]= matrices1[i][j]+matrices2[i][j];
            }
            System.out.println(" ");
        }
    }
}
