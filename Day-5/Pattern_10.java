import java.util.Scanner;
public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--) {
            char alphabet= 'A';
            for(int j=i;j>=1;j--) {
                System.out.print(alphabet+ "  ");
                alphabet++;
            }
            System.out.println();
        }
    }
}
//OUTPUT
//A  B  C  D  E  
//A  B  C  D
//A  B  C
//A  B
//A