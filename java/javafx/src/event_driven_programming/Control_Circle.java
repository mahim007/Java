package event_driven_programming;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Control_Circle extends Application {
    private CirclePane circlePane=new CirclePane();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox hBox=new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        Button enlargebtn=new Button("Enlarge");
        Button shrinkbtn=new Button("Shrink");
        hBox.getChildren().addAll(enlargebtn,shrinkbtn);

        enlargebtn.setOnAction(e -> {
            circlePane.enlarge();
        });
        shrinkbtn.setOnAction(e -> {
            circlePane.shrink();
        });

        BorderPane borderPane=new BorderPane();
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox,Pos.CENTER_LEFT);

        Scene scene=new Scene(borderPane, 200, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Control Circle Without Event Handling!");
        primaryStage.show();
    }

    public class EnlargeListener implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            circlePane.enlarge();
        }
    }

    public class ShrinkListener implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event) {
            circlePane.shrink();
        }
    }
}
