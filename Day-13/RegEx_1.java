import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegEx_1 {
    public static void main(String[] args) {
        final String REGEX_PATTERN = "[a-z]";
        Pattern r = Pattern.compile(REGEX_PATTERN);
        try {
            FileReader fr = new FileReader("C:\\100-Days-Work\\Day-13\\Data.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                Matcher m =r.matcher(line);
                if(m.find()) {
                    System.out.println(line);
                }
            }
            br.close();
        }catch(IOException e) {
            System.out.println(e);
        }
    }
}