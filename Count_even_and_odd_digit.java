public class Count_even_and_odd_digit {
    public static void main(String[] args) {


        int num =12346;

        int even_count=0;
        int odd_count=0;

        while(num>0) {

            int rem = num % 10; // 4

            if (rem % 2 == 0) {

                even_count++;  //1 1
            } else {

                odd_count++; //1 1
            }

            num = num / 10;
        }

        System.out.println("Even number count: "+ even_count);
        System.out.println("odd number count: "+ odd_count);

    }
}
