package MementoDesignPattern;

public class Memento {

    // Memento represents an Object which holds the state of the Originator
    int height;
    int width;

    public Memento(int height, int width) {
        this.height = height;
        this.width = width;
    }
}
