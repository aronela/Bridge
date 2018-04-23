public class Book extends Manuscript {
    private String _title, _text, _author;

    Book(IFormatter formatter) {
        super(formatter);
    }

    public void add(String title, String text, String author) {
        _title = title;
        _text = text;
        _author = author;
    }

    public String getTitle() {
        return _title;
    }

    public String getText() {
        return _text;
    }

    public String getAuthor() {
        return _author;
    }

    public void set_title(String _title) { this._title = _title; }

    public void set_text(String _text) { this._text = _text; }

    public void set_author(String _author) { this._author = _author; }


    public void print() {
        System.out.println(formatter.format("=====" + _title + "====="));
        System.out.println(formatter.format("            by " + _author));
        System.out.println(formatter.format(_text));
    }
}