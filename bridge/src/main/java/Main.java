import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<IManuscript> documents = new ArrayList<IManuscript>();
        IFormatter formatter1 = new BackwardFormatter();
        IFormatter formatter2 = new CenterFormatter();
        IFormatter formatter3 = new UpsideDownFormatter();

        FAQ faq = new FAQ(formatter1);
        faq.add(
                "Nonsense questions",
                new ArrayList<String>(Arrays.asList("first question", "second question"))
        );


        Book book = new Book(formatter2);
        book.add(
                "Another book",
                "whatever text fits as content because this is a small book",
                "me"
        );
        Paper paper = new Paper(formatter3);
        paper.add(
                "second year",
                "this is my master degree paper",
                "Smartest Ever"
        );

        documents.add(faq);
        documents.add(book);
        documents.add(paper);

        for (IManuscript docs: documents) {
            docs.print();
            System.out.println();
        }

    }
}
