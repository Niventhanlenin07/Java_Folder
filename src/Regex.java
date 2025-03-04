import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String Str="Hello there.Hello all ";
        Pattern p=Pattern.compile("all*$");
        Matcher m=p.matcher(Str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}