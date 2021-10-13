package Task4;

public class Subject {
    private String name;
    private double mark;

    public Subject(final String name) {
        this.name = name;
    }

    public Subject(final String name, final double mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setMark(final double mark) {
        this.mark = mark;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }
}
