import java.util.Scanner;
public class Example_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        int arr[]={2,5,7,9};
        System.out.println(arr[10]);
        }
    catch(ArrayIndexOutOfBoundsException e) 
    {
        System.out.println(e);

    }
    System.out.println("Rest of code");
}
}