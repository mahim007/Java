package event_driven_programming.BouncingBall;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

public class BallPaneControl extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BallPane ballPane=new BallPane();

        ballPane.setOnMousePressed(event -> {
            ballPane.stop();
        });

        ballPane.setOnMouseReleased(event -> {
            ballPane.play();
        });

        ballPane.setOnKeyPressed(event -> {
            if (event.getCode()== KeyCode.UP){
                ballPane.increaseSpeed();
            }
            else if (event.getCode()==KeyCode.DOWN){
                ballPane.decreaseSpeed();
            }
        });

        Scene scene=new Scene(ballPane, 250, 250);
        primaryStage.setTitle("Bouncing Ball");
        primaryStage.setScene(scene);
        primaryStage.show();

        ballPane.requestFocus();
    }
}
