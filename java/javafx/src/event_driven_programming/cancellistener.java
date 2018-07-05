package event_driven_programming;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class cancellistener implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("Cancel Button Clicked!");
    }
}
