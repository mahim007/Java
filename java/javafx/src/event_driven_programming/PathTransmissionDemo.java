package event_driven_programming;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PathTransmissionDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane=new Pane();

        Rectangle rectangle=new Rectangle(20, 30, 25, 50);
        rectangle.setFill(Color.ORANGE);

        Circle circle=new Circle(125, 100, 50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);

        pane.getChildren().addAll(circle,rectangle);

        PathTransition pathTransition=new PathTransition();
        pathTransition.setDuration(Duration.millis(5000));
        pathTransition.setPath(circle);
        pathTransition.setNode(rectangle);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        //pathTransition.setAutoReverse(true);
        pathTransition.play();

        circle.setOnMousePressed(e ->{
            pathTransition.pause();
        });

        circle.setOnMouseReleased(e -> {
            pathTransition.play();
        });

        Scene scene=new Scene(pane, 250, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Path Transmission Demo");
        primaryStage.show();

        pane.widthProperty().addListener(e -> {
            circle.setCenterX(pane.getWidth()/2);
            circle.setRadius(Math.min(pane.getHeight()/2, pane.getWidth()/2));

            PathTransition pathTransitionx=new PathTransition();
            pathTransitionx.setDuration(Duration.millis(5000));
            pathTransitionx.setPath(circle);
            pathTransitionx.setNode(rectangle);
            pathTransitionx.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
            pathTransitionx.setCycleCount(Timeline.INDEFINITE);
        });

        pane.heightProperty().addListener(e -> {
            circle.setCenterY(pane.getHeight()/2);
            circle.setRadius(Math.min(pane.getHeight()/2, pane.getWidth()/2));

            PathTransition pathTransitionx=new PathTransition();
            pathTransitionx.setDuration(Duration.millis(5000));
            pathTransitionx.setPath(circle);
            pathTransitionx.setNode(rectangle);
            pathTransitionx.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
            pathTransitionx.setCycleCount(Timeline.INDEFINITE);
        });
    }
}
