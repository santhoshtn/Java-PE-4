import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortParaWords {
    public static String[] sort(String s){
        String[] str=s.split("\\s");
        List<String> str1=(Arrays.asList(str));
        Collections.sort(str1);
        return str1.toArray(new String[0]);
    }
    public static void main(String[] args){
        String[] str=sort("hello world have a nice future");
        for (String item:str) {
            System.out.println(item);
        }
    }
}
