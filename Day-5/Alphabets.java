import java.util.Scanner;
public class Alphabets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                for(int i=1;i<=4;i++) {
                    char alphabet = 'A';
                    for(int j=1;j<=i;++j){
                        System.out.print(alphabet+  " ");
                        alphabet++;
                    }
                    System.out.println();

                }
        
            }
        }

   //OUTPUT
       // A 
       //A B
       //A B C
       //A B C D