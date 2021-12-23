import java .util.Scanner;
public class Example_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1="Java";
        String s2="Python";
        String s3="Cpp";
        String s4="JavaScript";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.compareTo(s4));
    }
}