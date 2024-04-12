package FacadeDesignPattern;
import FacadeDesignPattern.System.*;

// ShapeMaker is acting as Facade here
public class ShapeMaker {
    Shape circle;
    Shape rectangle;
    Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){

        circle.draw();
    }
    public void drawRectangle(){

        rectangle.draw();
    }
    public void drawSquare(){

        square.draw();
    }
}
