public class characterOccurence {
    public static long Count (String ch,String s){

        return(s.length()-s.replaceAll(ch,"").length());

    }
}
