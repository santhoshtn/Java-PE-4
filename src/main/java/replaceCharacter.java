public class replaceCharacter {
    public static String replace(String s) {
        return (s.replaceAll("d", "f").replaceAll("l", "t"));
    }

    public static void main (String[] args) {
        System.out.println(replace("dol"));
    }
}
