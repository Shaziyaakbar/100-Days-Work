import java.util.Scanner;
public class Example_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S= null;
        try {
            System.out.println(S.charAt(9));
        }
        catch(NullPointerException e) {
            System.out.println(e);
        }
    finally {
        System.out.println("Next Statement");
    }
}
}
