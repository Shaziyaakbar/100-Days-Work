import java.util.Scanner;
public class Pattern_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char alphabet = 'A';
        for(int i=1; i<=4;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(alphabet+ " ");
            }
            System.out.println();
            alphabet++;
        
        }
    }
}
//output
//A 
//B B
//C C C
//D D D D

