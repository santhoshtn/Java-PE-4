package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImplementRegex {
    public static boolean Regex(String string) {
        if(string==null){
            return false;
        }
        Pattern pattern = Pattern.compile(".*Harry.*");
        Matcher matcher = pattern.matcher(string);
        if(matcher.matches()) {
            return true;
        }
        return false;
    }

}
