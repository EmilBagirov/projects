package com.tac.kulik;

/**
 * Created by kulik on 22.05.15.
 */
public class Circle {
    Point center;
    int radius;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void drawCircle() {
        System.out.println("I am Circle: my center: " + center.toString()
                + " and my Radius: " + radius);
    }

}
