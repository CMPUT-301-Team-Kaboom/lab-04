package com.example.teamkaboom;

public abstract class Shape {
    private int x;
    private int y;
    String color = "green";
    
    public Shape(){
        x = 0;
        y = 0;
    }
    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
}
