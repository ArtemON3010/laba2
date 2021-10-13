package Task3;

public class Mark {
    private int mark;

    public Mark(final int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(final int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "" + getMark();
    }


}
