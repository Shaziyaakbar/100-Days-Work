import java.util.Scanner;
public class Example_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name="What did you do in your daily life";
        System.out.println(name.contains("you do in"));
        System.out.println(name.contains("What did"));
        System.out.println(name.contains("daily routine"));
    }
}