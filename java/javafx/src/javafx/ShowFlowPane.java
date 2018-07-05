package javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane flowPane=new FlowPane(Orientation.HORIZONTAL, 10, 10);
        flowPane.setPadding(new Insets(11, 12, 13, 3));

        flowPane.getChildren().addAll(new Label("first name: "), new TextField(), new Label("MI: "));
        TextField textField=new TextField();
        textField.setPrefColumnCount(5);
        flowPane.getChildren().addAll(textField, new Label("last name: "), new TextField());

        Scene scene=new Scene(flowPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Show Flow Pane");
        primaryStage.show();
    }
}
