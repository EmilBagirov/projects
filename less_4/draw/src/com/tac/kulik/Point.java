package com.tac.kulik;

/**
 * Created by kulik on 22.05.15.
 */
public class Point implements IVector {

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int x;
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public float distanceFromZ() {
        return (float) Math.sqrt(x*x+y*y);
    }

    @Override
    public String toString() {
        return "(x: " + x + "; y:" + y + ")";
    }
}
