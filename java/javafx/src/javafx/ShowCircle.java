package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Circle circle=new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLUE);
        circle.setFill(Color.YELLOW);

        Pane pane=new Pane();
        pane.getChildren().add(circle);

        Scene scene=new Scene(pane,300,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Show Circle");
        primaryStage.show();
    }
}
