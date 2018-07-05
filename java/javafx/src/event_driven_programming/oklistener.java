package event_driven_programming;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class oklistener implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        System.out.println("OK Button Clicked!");
    }
}
