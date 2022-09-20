package Entity;

public class Hangman {
    
    private String [] word;
    private String [] spaces;
    private int lettersFound = 0;
    private int trys;

    public Hangman() {
    }

    public String[] getWord() {
        return word;
    }

    public void setWord(String[] word) {
        this.word = word;
    }

    public String[] getSpaces() {
        return spaces;
    }

    public void setSpaces(String[] spaces) {
        this.spaces = spaces;
    }

    public int getLettersFound() {
        return lettersFound;
    }

    public void setLettersFound(int lettersFound) {
        this.lettersFound = lettersFound;
    }

    public int getTrys() {
        return trys;
    }

    public void setTrys(int trys) {
        this.trys = trys;
    }



    

    
    
    

}
