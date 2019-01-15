package com.stackroute;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortParaWords {
    public static String[] sort(String input){
        if(input==null)
        {
            return null;
        }
        String[] str=input.split("\\s");
        List<String> str1=(Arrays.asList(str));
        Collections.sort(str1);
        return str1.toArray(new String[0]);
    }
}
