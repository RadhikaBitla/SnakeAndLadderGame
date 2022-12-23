package com.example.demo;

import javafx.application.Application;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class SnakeAndLadder extends Application {
    public static final int tilesize=40, width=10, height=10;
    public Pane createContent()
    {
        Pane root=new Pane();
        root.setPrefSize(width*tilesize,height*tilesize+100);

        Player player1=new Player(tilesize, Color.BLACK,"Radhika");
        Player player2=new Player(tilesize-15,Color.WHITE,"Nisha");
        for(int i=0;i<width;i++)
        {
            for(int j=0;j<height;j++)
            {
                Tile tile=new Tile(tilesize);
                tile.setTranslateX(j*tilesize);
                tile.setTranslateY(i*tilesize);
                root.getChildren().add(tile);
            }
        }
        Image img=new Image("C:\\Users\\radhika\\demo\\src\\main\\img.png");
        ImageView boardImage=new ImageView();
        boardImage.setImage(img);
        boardImage.setFitWidth(tilesize*width);
        boardImage.setFitHeight(tilesize*height);

        Button player1Button=new Button("Player 1");
        player1Button.setTranslateX(20);
        player1Button.setTranslateY(tilesize*height+50);
        Button player2Button=new Button("Player 2");
        player2Button.setTranslateX(300);
        player2Button.setTranslateY(tilesize*height+50);

        root.getChildren().addAll(boardImage,player1Button,player2Button,player1.getCoin(),player2.getCoin());
        return root;
    }
    @Override
    public void start(Stage stage) throws IOException {
      //  FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(createContent());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}