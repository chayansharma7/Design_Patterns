package MementoDesignPattern;

public class Originator {

    // Originator represents the object
    // This design pattern is also known as Snapshot Design Pattern
    int height;
    int width;

    public Originator(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Here you see it does not exposes internal implementation of object
    public Memento createMemento(){
        return new Memento(this.height, this.width);
    }

    public void restoreMemento(Memento mementoToBeRestored){

        this.height = mementoToBeRestored.height;
        this.width = mementoToBeRestored.width;
    }
}

// Provide ability to restore object state