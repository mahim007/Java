package event_driven_programming;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Calculator extends Application {

    private TextField number1=new TextField();
    private TextField number2=new TextField();
    private TextField result=new TextField();
    private Button calculate=new Button("Calculate");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane=new GridPane();
        gridPane.setHgap(5);
        gridPane.setHgap(5);

        gridPane.add(new Label("number 1: "), 0, 0);
        gridPane.add(number1, 1, 0);
        gridPane.add(new Label("Number 2: "), 0, 1);
        gridPane.add(number2, 1, 1);
        gridPane.add(new Label("result: "), 0, 2);
        gridPane.add(result, 1, 2);
        gridPane.add(calculate, 1, 3);

        gridPane.setAlignment(Pos.CENTER);
        number1.setAlignment(Pos.BOTTOM_RIGHT);
        number2.setAlignment(Pos.BOTTOM_RIGHT);
        result.setAlignment(Pos.BOTTOM_RIGHT);
        result.setEditable(false);
        GridPane.setHalignment(calculate, HPos.RIGHT);

        calculate.setOnAction(event -> {
            double d1=Double.parseDouble(number1.getText());
            double d2=Double.parseDouble(number2.getText());
            double ans=d1+d2;
            result.setText(String.format("$%.2f", ans));
        });

        Scene scene=new Scene(gridPane, 200, 200);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
