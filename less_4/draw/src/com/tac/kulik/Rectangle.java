package com.tac.kulik;

/**
 * Created by kulik on 22.05.15.
 */
public class Rectangle {
    //    extends Figure {
    private Point startPoint;
    private Point endPoint;

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public void drawRect() {
        System.out.println("I am Rectangle: my left point: " + startPoint.toString()
                + ", my right point: " + endPoint.toString());
    }
}
