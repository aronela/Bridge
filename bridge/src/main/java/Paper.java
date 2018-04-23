public class Paper extends Manuscript {
    private String _class, _text, _student;

    Paper(IFormatter formatter){
        super(formatter);
    }

    public void add(String clas, String text, String student) {
        _class = clas;
        _text = text;
        _student = student;
    }

    public String getClas() {
        return _class;
    }

    public String getText() {
        return _text;
    }

    public String getStudent() {
        return _student;
    }

    public void set_class(String _class) { this._class = _class; }

    public void set_text(String _text) { this._text = _text; }

    public void set_student(String _student) { this._student = _student; }

    public void print() {
        System.out.println(formatter.format("This paper was made by " +_student + " from " + _class));
        System.out.println(formatter.format(_text));
    }
}
