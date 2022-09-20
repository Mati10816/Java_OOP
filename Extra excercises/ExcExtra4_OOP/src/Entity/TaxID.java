package Entity;

public class TaxID {
    
    private long personId;
    private String letter;

    public TaxID(long personId, String letter) {
        this.personId = personId;
        this.letter = letter;
    }

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
    
    

}
