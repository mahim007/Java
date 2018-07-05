package event_driven_programming;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Handle_Event extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        HBox pane=new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button okbtn=new Button("OK");
        Button cancelbtn=new Button("CANCEL");

        oklistener ok=new oklistener();
        okbtn.setOnAction(ok);

        cancellistener cancel=new cancellistener();
        cancelbtn.setOnAction(cancel);

        pane.getChildren().addAll(okbtn,cancelbtn);

        Scene scene=new Scene(pane);
        primaryStage.setTitle("Handle Event");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
