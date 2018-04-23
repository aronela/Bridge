public class CenterFormatter implements IFormatter {
    public String format(String value) {
        int spaces = 100;
        spaces = (spaces - value.length()) / 2;
        for(int i = 0; i < spaces; i++){
            value = " " + value;
        }
        return value;
    }
}
