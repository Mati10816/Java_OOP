package Entity;

public class Str {

    private String phrase;
    private int longitude;

    public Str() {
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Str{" + "phrase=" + phrase + ", longitude=" + longitude + '}';
    }
    
    

}
