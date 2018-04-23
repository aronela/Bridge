public abstract class Manuscript implements  IManuscript {
    protected final IFormatter formatter;

    Manuscript(IFormatter formatter) {
        this.formatter = formatter;
    }
     public abstract void print();
}
