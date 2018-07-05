package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ShowCircleCentered extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane=new StackPane();

        Circle circle=new Circle();
        //circle.centerXProperty().bind(pane.widthProperty().divide(2.0));
        //circle.centerYProperty().bind(pane.heightProperty().divide(2.0));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);
        pane.getChildren().add(circle);
        //pane.setRotate(65);
        pane.setStyle("-fx-border-color: red; -fx-background-color: green");

        Label label=new Label("Bangladesh");
        label.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, FontPosture.ITALIC, 20));
        pane.getChildren().add(label);

        Scene scene=new Scene(pane,300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("show circle centered");
        primaryStage.show();

    }
}
