
public class LengthofLastWord {

    public static void main(String[] args) {
      
    }

    public static int lengthOfLastWord(String s) {

        String[] arrOfStr = s.split(" ");

        return arrOfStr[arrOfStr.length-1].length();
    }
}