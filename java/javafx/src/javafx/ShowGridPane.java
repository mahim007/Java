package javafx;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane=new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(5);

        gridPane.add(new Label("First Name: "), 0, 0);
        gridPane.add(new TextField(), 1 ,0);
        gridPane.add(new Label("MI: "), 0, 1);
        gridPane.add(new TextField(), 1,1);
        gridPane.add(new Label("Last Name: "),0,2);
        gridPane.add(new TextField(),1,2);
        Button button=new Button("Add Name");
        gridPane.add(button,1,3);
        GridPane.setHalignment(button, HPos.RIGHT);

        Scene scene=new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Show Grid Pane");
        primaryStage.show();
    }
}
