package MementoDesignPattern;

public class Client {
    public static void main(String[] args) {

        Caretaker caretakerObject = new Caretaker();
        Originator originatorObject = new Originator(5, 10);

        // save it
        Memento snapshot1 = originatorObject.createMemento();

        // add it to history
        caretakerObject.addMemento(snapshot1);

        // originator changing to new state
        originatorObject.setHeight(7);
        originatorObject.setWidth(12);

        // save it
        Memento snapshot2 = originatorObject.createMemento();

        // add it to history
        caretakerObject.addMemento(snapshot2);

        // originator changing to new state
        originatorObject.setHeight(9);
        originatorObject.setHeight(14);

        // UNDO
        Memento restoreStateMementoObj = caretakerObject.undo();
        originatorObject.restoreMemento(restoreStateMementoObj);

        System.out.println("Height : " +originatorObject.height+ " Width : " + originatorObject.width);
    }
}
