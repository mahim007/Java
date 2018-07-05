package javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ImageShow extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane=new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));
        Image image1=new Image("IMG_2937.JPG");
        ImageView imageView1=new ImageView(image1);
        imageView1.setFitHeight(100);
        imageView1.setFitWidth(100);
        pane.getChildren().add(imageView1);

        ImageView imageView=new ImageView("IMG_2938.JPG");
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        pane.getChildren().add(imageView);

        Image image2=new Image("IMG_2949.JPG");
        ImageView imageView2=new ImageView(image2);
        imageView2.setFitWidth(100);
        imageView2.setFitHeight(100);
        imageView2.setRotate(90);
        pane.getChildren().add(imageView2);

        Scene scene=new Scene(pane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Image show");
        primaryStage.show();
    }
}
