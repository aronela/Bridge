public class UpsideDownFormatter implements IFormatter {
    public String format(String value) {
        String[] words = value.split(" ");

        String rev = "";
        for(int i = words.length - 1; i >= 0 ; i--)
        {
            rev += words[i] + " ";
        }
        return rev;
    }
}
