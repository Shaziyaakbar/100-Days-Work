import java.util.Scanner;
public class Example_6 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String s1="Shaziya";
        String s2="SHAZIYA";
        String s3="adil";
        String s4="adil";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4)); 
    }
}