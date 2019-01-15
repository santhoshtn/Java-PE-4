package com.stackroute;//Write a program to replace all d with f and all l with t in the given String
//        Input: daily dry
//        Output: faity fry

public class ReplaceCharacter {
    public static String replace(String input) {
        if(input==null)
        {
            return null;
        }
        return (input.replaceAll("d", "f").replaceAll("l", "t"));
    }
}
