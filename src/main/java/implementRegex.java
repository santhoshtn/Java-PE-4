import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class implementRegex {
    public static boolean Regex(String string) {
        Pattern pattern = Pattern.compile(".*Harry.*");
        Matcher matcher = pattern.matcher(string);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args){

        System.out.println(Regex("This is Harry"));

    }
}
