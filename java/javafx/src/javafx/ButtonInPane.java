package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        StackPane stackPane=new StackPane();
        stackPane.getChildren().add(new Button("ok"));
        Scene scene=new Scene(stackPane,300,200);
        primaryStage.setTitle("Button In a Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
