import java.util.Scanner;
public class Pattern_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';
        for(int i=1;i<=5;i++) {
            for(int j=i;j<=n;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(ch+ " ");
            }
            System.out.println();
            ch++;
        }
    }
}
//OUTPUT
5
//     A
//    B B
//   C C C
//  D D D D
// E E E E E