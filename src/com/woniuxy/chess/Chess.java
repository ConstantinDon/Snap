package com.woniuxy.chess;

import javafx.scene.paint.Color;

import java.util.ArrayList;


public class Chess {
    private int xIndex; // x坐标
    private int yIndex;// y坐标


    public void setChess(int xIndex, int yIndex) {
        this.xIndex = xIndex;
        this.yIndex = yIndex;
    }

    public int getxIndex() {
        return xIndex;
    }

    public int getyIndex() {
        return yIndex;
    }

}