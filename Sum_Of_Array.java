public class Sum_Of_Array {
    public static void main(String[] args) {


        int a[]={5,4,6,2,1}; // n=5;  n=4;
        int sum=0;
     /*   *//*for( int i=0;i<=a.length-1;i++)  //0   //a.length-1 =4;
        {
            sum=sum+a[i];*//*
        }*/
       // enhanced  or for each loop
        for(int value: a)
        {

            sum = sum+value;
        }

        System.out.println(" Sum of Arrays elements is "+" " +sum);
    }
}
