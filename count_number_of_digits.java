public class count_number_of_digits {
    public static void main(String[] args) {


        int num=12456;
        int count=0;
        while(num>0){

            num=num/10;
            count++;
        }
        System.out.println("Number of digits: "+count);
    }
}
