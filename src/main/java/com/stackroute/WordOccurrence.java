package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class WordOccurrence {
    public  String[] findIndexes(String word,String inputString){
        if(word==null || inputString==null)
        {
            return null;
        }
        List<Integer> Index=new ArrayList<>();
        List<String> returnString=new ArrayList<>();
        int index = inputString.indexOf(word);
        Index.add(index);
        while (index >=0){

            index = inputString.indexOf(word, index+word.length());
            if(index>=0)
                Index.add(index);
        }
        for (int item:Index) {
            int length=item+word.length()-1;
            returnString.add("Found at : "+item+" - "+length);
        }
        return returnString.toArray(new String[0]);
    }
}
