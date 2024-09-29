package string;

public class question_1 {
    public static void main(String[] args) {

        String s1 ="pramod";  // SCP
        String s2 = new String("pramod"); //OA

        // string - immutable -> once created cant be changed

      /*  StringBuffer stringBuffer = new StringBuffer("pramod");
        stringBuffer.append("dutta");
        System.out.println(stringBuffer);*/

        StringBuilder stringBuilder = new StringBuilder("pramod");
        stringBuilder.append("Singh");
        stringBuilder.reverse();

        System.out.println(stringBuilder);




    }
}
