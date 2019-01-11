import java.util.ArrayList;
import java.util.List;

public class wordOccurence {
    public static String[] findIndexes(String word,String inputString){
        List<Integer> Index=new ArrayList<Integer>();
        List<String> returnString=new ArrayList<String>();
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

    public static void main(String[] args) {
        String[] result=findIndexes("see","see her sea hersee");
        for (String item:result) {
            System.out.println(item);
        }
    }
}
