
import java.util.ArrayList;

public class CD implements ToBeStored {

    private String artist;
    private String title;
    private int publishingYear;
    private double weight;
    //ArrayList<ToBeStored> cdS;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = 0.1;
    }
    
    @Override
    public double weight() {
        return this.weight;
    }

}
