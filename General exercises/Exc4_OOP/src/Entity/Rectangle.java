package Entity;

public class Rectangle {

    private int length;
    private int high;

    public Rectangle(int length, int high) {
        this.length = length;
        this.high = high;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", high=" + high + '}';
    }

    

}
