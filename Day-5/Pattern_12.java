import java.util.Scanner;
public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          //char alphabet = 'E';
        for(int i=1;i<=n;i++) {
           char alphabet = 'E';
            for(int j=1;j<=i;j++) {
                System.out.print(alphabet+"  ");
                alphabet--;
            }
            System.out.println();
        }
    }
}


    
  //OUTPUT  
//E  
//E  D
//E  D  C
//E  D  C  B
//E  D  C  B  A  