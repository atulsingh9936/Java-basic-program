package Arrays;

public class Max_salary {
    public static void main(String[] args) {

        int[] salary ={12345555,30,50,60,90,10, 100,999,8888};
        int max_salary=salary[0];
        for(int i=0;i<salary.length;i++){
            if(salary[i]>max_salary){
                max_salary=salary[i];

            }


        }
        System.out.println(max_salary);

    }
}
