import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Generate_Random_number_And_Strings {
    public static <string> void main(String[] args) {
        // approach1  random
//        Random rand = new Random();
//       int rand_int =rand.nextInt(1500);
//        System.out.println(rand_int);

//        Double rand_dbl =rand.nextDouble();  //range is from 0.0 to 1.0
//        System.out.println(rand_dbl);

        // approach math

//        System.out.println(Math.random());

        //approach 3- Apache commons language API
//       String rand_num= RandomStringUtils.randomNumeric(5);
//        System.out.println(rand_num);

        String ranstr =RandomStringUtils.randomAlphabetic(10);
        System.out.println(ranstr);


    }
}

