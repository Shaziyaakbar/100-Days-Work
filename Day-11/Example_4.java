import java.util.Scanner;
public class Example_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            String s="Apple";
            System.out.println(s.charAt(7));
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println(e);

        }
        System.out.println("Rest of code");
    }
}