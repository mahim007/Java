package Clock_project;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockPane extends Pane {
    private int hour;
    private int minute;
    private int second;
    private double w=500;
    private double h=500;

    public ClockPane(){
        setCurrentTime();
    }

    public ClockPane(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
        paintClock();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
        paintClock();
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
        paintClock();
    }

    public void setCurrentTime(){
        Calendar calendar=new GregorianCalendar();

        this.hour=calendar.get(Calendar.HOUR_OF_DAY);
        this.minute=calendar.get(Calendar.MINUTE);
        this.second=calendar.get(Calendar.SECOND);

        paintClock();
    }

    protected void paintClock(){
        double clockrad=Math.min(w,h)*0.8*0.5;
        double centerx=w/2.0;
        double centery=h/2.0;

        Circle circle=new Circle(centerx, centery, clockrad);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Text t1=new Text(centerx-7,centery-clockrad+10, "12");
        Text t2=new Text(centerx-clockrad+7,centery+7, "9");
        Text t3=new Text(centerx-5,centery+clockrad-5, "6");
        Text t4=new Text(centerx+clockrad-7,centery-7, "3");

        //draw second hand
        double slength=clockrad*0.8;
        double secondx=centerx+slength*Math.sin(second*2.0*Math.PI/60.0);
        double secondy=centery-slength*Math.cos(second*2.0*Math.PI/60.0);
        Line sline=new Line(centerx,centery,secondx,secondy);
        sline.setStroke(Color.RED);

        //draw minute hand
        double mlength=clockrad*.65;
        double minutex=centerx+mlength*Math.sin(minute*2.0*Math.PI/60.0);
        double minutey=centery-mlength*Math.cos(minute*2.0*Math.PI/60.0);
        Line mline=new Line(centerx,centery,minutex,minutey);
        mline.setStroke(Color.BLUE);

        //draw hour hand
        double hlength=clockrad*0.4;
        double hourx=centerx+hlength*Math.sin((hour%12 + minute/60) * (2.0*Math.PI/12.0));
        double houry=centery-hlength*Math.cos((hour%12 + minute/60) * (2.0*Math.PI/12.0));
        Line hline=new Line(centerx,centery,hourx,houry);
        hline.setStroke(Color.GREEN);

        getChildren().clear();
        getChildren().addAll(circle,t1,t2,t3,t4,hline,mline,sline);

    }
}
