import java.util.*;
import java.io.*;
public class Example_1 {
    public static void main(String[] args) {
        String[] arr = new String[4];
        arr[0] ="welcome";
        arr[1] ="to";
        arr[2] ="java";
        arr[3] ="w  orld";
        int length = arr.length;
        for(int i=0;i<=length-1;i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for (int i=0;i<=length;i++) {
            System.out.print(arr[i] +"  ");

        }

    }
}