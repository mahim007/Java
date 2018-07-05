package event_driven_programming;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirclePane extends StackPane {
    private Circle circle=new Circle(50);

    public CirclePane(){
        this.getChildren().add(circle);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);
    }

    public void enlarge(){
        circle.setRadius(circle.getRadius()+2);
    }

    public void shrink(){
        circle.setRadius(circle.getRadius() > 2 ? circle.getRadius()-2 : circle.getRadius());
    }
}
