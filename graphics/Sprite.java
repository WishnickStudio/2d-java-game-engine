/*******************************************************
 * Copyright (C) 2018 Grayson Charlier <grayigami@gmail.com>
 * 
 * This file is part of the 2D Java Game Engine project.
 * 
 * The 2D Java Game Engine project can not be copied and/or distributed without the express
 * permission of Grayson Charlier.
 *******************************************************/

public class Sprite {

    private int sprX;
    private int sprY;
    private int sprRot;
    private int sprWid;
    private int sprHgt;
    private int[][] sprSheet;
    private int numOfFrames;
    private int sprIndex;
    
    public Sprite() {
    
        sprX = 0;
        sprY = 0;
        sprRot = 0;
        sprWid = 1;
        sprHgt = 1;
        sprSheet = new int[1][1];
        numOfFrames = 1;
        sprIndex = 0;
    }
    
    public void setPosX(int x) {
    
        sprX = x;
    }
    public void setPosY(int y) {
    
        sprY = y;
    }
    public void setRot(int r) {
    
        sprRot = r;
    }
    public void setWidth(int w) {
    
        sprWid = w;
    }
    public void setHeight(int h) {
    
        sprHgt = h;
    }
    public void setNumOfFrames(int f) {
    
        numOfFrames = f;
    }
    public void setIndex(int i) {
    
        sprIndex = i;
    }
    public void setSpritesheet(int[][] ss) {
    
        for (int x = 0; x < sprWid; x++) {
        
            for (int y = 0; y < sprHgt; y++) {
            
                sprSheet[x][y] = ss[x][y];
            }
        }
    }
    public void nextFrame() {
        sprIndex++;
        if ((sprIndex + 1) > numOfFrames) {
            sprIndex = 0;
        }
        else {
        
        }
    }
    
    public int getPosX() {
    
        return sprX;
    }
    public int getPosY() {
    
        return sprY;
    }
    public int getRotation() {
    
        return sprRot;
    }
    public int getWidth() {
    
        return sprWid;
    }
    public int getHeight() {
    
        return sprHgt;
    }
    public int getIndex() {
    
        return sprIndex;
    }
    public int getNumOfFrames() {
    
        return numOfFrames;
    }
    public int[sprWid][sprHgt] getSpr() 
    
        int[][] temp = new int[sprWid][sprHgt];
        for (int x = 0; x < sprWid; x++) {
        
            for (int y = 0; y < sprHgt; y++) {
            
                temp[x][y] = sprSheet[(sprWid * sprIndex) + x][(sprHgt * sprIndex) + y];
            }
        }
        if (sprIndex < numOfFrames) {
        
            sprIndex++;
        }
        else {
        
            sprIndex = 0;
        }
    }
}
