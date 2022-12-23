package com.example.demo;

import javafx.scene.shape.Circle;
import  javafx.scene.paint.Color;

public class Player
{
    public Circle coin;
    public int coinposition;
    private String name;
    public Player(int tilesize, Color coinColor, String name)
    {
        coinposition=1;
        coin=new Circle(tilesize/2);
        coin.setFill(coinColor);
        coin.setTranslateX(20);
        coin.setTranslateY(380);
    }

    public Circle getCoin() {
        return coin;
    }

    public int getCoinposition() {
        return coinposition;
    }

    public void setName(String name) {
        this.name = name;
    }

}
