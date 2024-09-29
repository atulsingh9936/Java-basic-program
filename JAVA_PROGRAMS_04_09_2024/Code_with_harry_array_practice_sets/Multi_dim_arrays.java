package JAVA_PROGRAMS_04_09_2024.Code_with_harry_array_practice_sets;

public class Multi_dim_arrays {
    public static void main(String[] args) {
        int [][] flats = new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=104;
        flats[1][1]=105;
        flats[1][2]=106;

        for(int i=0;i< flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }


    }
}
