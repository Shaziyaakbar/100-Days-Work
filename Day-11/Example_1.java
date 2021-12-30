import java.util.Scanner;
public class Example_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int n= 1/0;
            System.out.println("Rest of code in try block");
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }
    }
}