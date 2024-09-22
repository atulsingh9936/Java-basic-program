package JAVA_PROGRAMS_04_09_2024.Pattern.Charcater_pattern;

public class Coder_pattern {
    public static void main(String[] args) {
        String s ="CODER";
        int n = s.length();
        for(int i=1,p=0;i<=n;i++,p++){
            for(int j=1;j<=i;j++){
                System.out.print(s.charAt(p)+" ");
            }
            System.out.println();
        }
    }
}
