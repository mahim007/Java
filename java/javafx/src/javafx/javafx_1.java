package javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class javafx_1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button=new Button("OK");
        Scene scene=new Scene(button, 200, 250);
        primaryStage.setTitle("First Java FX program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
