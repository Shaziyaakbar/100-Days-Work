import java.util.Scanner;
import java.io.*;

public class Day_2{
    public static void main(String[] args) {
        double temp;
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        for(int i=0;i<A;i++) {
            temp=0.0;
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            for(int j=0;j<D;j++) {
                temp=temp+(Math.pow(2,j)*C);
                System.out.print(A+(int)temp+" ");

            }
            System.out.println();

        }
    }
}