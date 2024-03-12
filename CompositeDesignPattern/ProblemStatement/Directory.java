package CompositeDesignPattern.ProblemStatement;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object> objectList;

    public Directory(String directoryName){
        this.directoryName = directoryName;
        objectList = new ArrayList<>();
    }

    public void add(Object object) {
        objectList.add(object);
    }

    public void ls(){

        System.out.println("Directory Name: " + directoryName);

        for(Object obj: objectList) {

            if(obj instanceof File) {

                // if it is file then typecast it in File
                ((File) obj).ls();
            }
            else if(obj instanceof Directory) {

                // if it is object then typecast it in Object
                ((Directory) obj).ls();
            }
        }
    }
}

