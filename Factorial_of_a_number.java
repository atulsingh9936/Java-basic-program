public class Factorial_of_a_number {
    public static void main(String[] args) {


        int num =5;
        long factorial =1;

       /* for( int i=1;i<=num;i++){
            factorial = factorial*i;
        }*/
        
        for( int i=num; i>=1;i--){
            factorial = factorial*i;
        }

        System.out.println("Factorial of a number is "+ factorial);
    }
}
