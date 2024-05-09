package MementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    // Caretaker manages the list of States (i,e. list of Memento)
    List<Memento> history = new ArrayList<>();

    public void addMemento(Memento memento){

        history.add(memento);
    }

    public Memento undo(){

        if(!history.isEmpty()){

            int idx = history.size() - 1;
            Memento lastMemento = history.get(idx);
            history.remove(lastMemento);
            return lastMemento;
        }
        return null;
    }
}
