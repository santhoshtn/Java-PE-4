package com.stackroute;

public class TransposeString {
    public static String transpose(String input){
        if(input==null)
        {
            return null;
        }
        String[] split=input.split("\\s");
        String returnString="";
        for(int i=0;i<split.length;i++){
            StringBuilder temp=new StringBuilder();
            temp.append(split[i]);
            temp=temp.reverse();
            returnString+=temp+ " ";
        }
        return returnString.trim();
    }
   }
