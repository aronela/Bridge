public class BackwardFormatter implements IFormatter {
    public String format(String value) {
        return new StringBuilder(value).reverse().toString();
    }
}
