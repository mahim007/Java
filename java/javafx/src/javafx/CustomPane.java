package javafx;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class CustomPane extends StackPane {
    public CustomPane(String str){
        this.getChildren().add(new Label(str));
        this.setStyle("-fx-border-color: red");
        this.setPadding(new Insets(10, 11, 12, 13));
    }
}
