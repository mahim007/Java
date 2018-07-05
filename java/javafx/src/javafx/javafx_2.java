package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class javafx_2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene1=new Scene(new Button("first"), 200, 300);
        primaryStage.setTitle("first stage");
        primaryStage.setScene(scene1);
        primaryStage.show();

        Stage stage=new Stage();
        Scene scene2=new Scene(new Button("second"), 200, 300);
        stage.setTitle("second stage");
        stage.setScene(scene2);
        stage.show();
    }
}
