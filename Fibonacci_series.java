   public class Fibonacci_series {
     public static void main(String[] args) {
//         int k,a=1,b=1;
//         k=0;
//        System.out.print("1 1 ");
//
//        while (k <= 50) {
//            k=a+b;
//            System.out.print(  k+ " ");
//            a=b;
//            b=k;
//
//        }
//         int n1=0,n2=1,n3,i,count=10;
//         System.out.print(n1+" "+n2);//printing 0 and 1
//
//         for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
//         {
//             n3=n1+n2;
//             System.out.print(" "+n3);
//             n1=n2;
//             n2=n3;
//         }




         int n1=0,n2=1,n3,counter=10;
         System.out.print(n1+ " " + n2+" " );
         for(int i=2;i<=counter;i++){
             n3=n1+n2;
             n1=n2;
             n2=n3;
             System.out.print( n3+ " ");
         }






     }
    }



