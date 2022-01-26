import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example_2 {
    public static void main(String[] args) {
           String str = "A  line with  multiples paces between  some words";
           String result = str.replaceAll("\\s+"," ");
           System.out.println(result);
    }
}

//OUTPUT
//A line with multiples paces between some words