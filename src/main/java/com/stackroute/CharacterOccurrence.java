package com.stackroute;
//Write a java program to count the total number of occurrences of a given character in a string without using any loop?
//        For Example- Java is java again java again count number of occurrence of a in the given string

//class Character occurrence
public class CharacterOccurrence {
    //method count takes two string inputs and returns a integer value
    public static Integer count(String character, String string){
        if(character==null || string==null)
        {
            return null;
        }
        return(string.length()-string.replaceAll(character,"").length());
    }
}
