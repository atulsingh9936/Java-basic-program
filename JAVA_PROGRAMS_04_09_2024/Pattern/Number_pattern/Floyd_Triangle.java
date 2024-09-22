package JAVA_PROGRAMS_04_09_2024.Pattern.Number_pattern;

public class Floyd_Triangle {
    public static void main(String[] args) {
        int n =5,p=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
    }
}
