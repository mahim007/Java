package event_driven_programming.BouncingBall;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class BallPane extends Pane {
    private final double rad=20.0;
    private double x=rad;
    private double y=rad;
    private double dx=1;
    private double dy=1;
    private Circle circle=new Circle(x,y,rad);
    private Timeline timeline;

    public BallPane(){
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);
        this.getChildren().add(circle);
        timeline=new Timeline(new KeyFrame(Duration.millis(50), e -> {moveBall();}));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    public void play(){
        timeline.play();
    }

    public void stop(){
        timeline.stop();
    }

    public void increaseSpeed(){
        timeline.setRate(timeline.getRate()+0.1);
        System.out.println("speed = "+timeline.getRate());
    }

    public void decreaseSpeed(){
        timeline.setRate(timeline.getRate() > 0 ? timeline.getRate()-0.1 : 0);
        //System.out.println("speed = "+timeline.getRate());
    }

    protected void moveBall(){
        if (x<rad || x>this.getWidth()-rad){
            dx*=-1;
        }

        if (y<rad || y>this.getHeight()-rad){
            dy*=-1;
        }

        x+=dx;
        y+=dy;
        circle.setCenterX(x);
        circle.setCenterY(y);
    }
}