import java.util.Scanner;
public class Pattern_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=4;i++) {
            char ch = 'A';
            for(int j=i;j<=n;++j) {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++) {
                System.out.print(ch+"  ");
                ch++;
            }
            System.out.println();
        }
    }
}
//OUTPUT
 //         A
   //     A  B
     // A  B  C
   //  A  B  C  D