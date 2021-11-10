package Task3;

public class Rating_Task3 {
    private int rating;

    //Constructor
    public Rating_Task3(final int rating){
        this.rating = rating;
    }
    public Rating_Task3(){
    }

    //Getter
    public int getRating() {
        return rating;
    }

    //Setter
    public void setRating(final int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "" + getRating();
    }
}
