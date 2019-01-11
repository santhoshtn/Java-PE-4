public class transposeString {
    public static String transpose(String input){
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
    public static void main(String[] args){
        System.out.println(transpose("I am Santhosh"));
    }
}
