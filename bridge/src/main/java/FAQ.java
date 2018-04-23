import java.util.ArrayList;

public class FAQ extends Manuscript {
    private String _title;
    private ArrayList<String> _questions;

    FAQ(IFormatter formatter) {
        super(formatter);
    }

    public void add(String title, ArrayList<String> questions) {
        _title = title;
        _questions = questions;
    }

    public String getTitle() {
        return _title;
    }

    public ArrayList<String> getQuestions() {
        return _questions;
    }

    public void set_title(String _title) { this._title = _title; }

    public void set_questions(ArrayList<String> _questions) { this._questions = _questions; }

    public void print() {
        System.out.println(formatter.format(_title + ":"));

        for (String question : _questions) {
            System.out.println(formatter.format(question));
        }
    }
}