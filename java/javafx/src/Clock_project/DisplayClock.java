package Clock_project;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DisplayClock extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ClockPane clock=new ClockPane();
        String time=clock.getHour()+ ":" +clock.getMinute() + ":" +clock.getSecond();
        Label label=new Label(time);

        BorderPane borderPane=new BorderPane();
        borderPane.setCenter(clock);
        borderPane.setBottom(label);
        BorderPane.setAlignment(label, Pos.CENTER);
        BorderPane.setAlignment(clock,Pos.CENTER);

        EventHandler<ActionEvent> eventHandler= event -> {
            clock.setCurrentTime();
            label.setText(clock.getHour()+ ":" +clock.getMinute() + ":" +clock.getSecond());
        };
        Timeline timeline=new Timeline(new KeyFrame(Duration.millis(1000), eventHandler));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        Scene scene=new Scene(borderPane,500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Display Clock");
        primaryStage.show();

        borderPane.widthProperty().addListener(e->{
            clock.setW(borderPane.getWidth());
            //System.out.println("width = "+borderPane.getWidth());
        });

        borderPane.heightProperty().addListener(e -> {
            clock.setH(borderPane.getHeight());
            //System.out.println("height = "+borderPane.getHeight());
        });
    }
}
