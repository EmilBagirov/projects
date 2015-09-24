package com.tac.kulik;

/**
 * Created by kulik on 22.05.15.
 */
public class Line {
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

    public void drawLine() {
        System.out.println("I am Line: my start point: " + startPoint.toString()
                + ", my endPoint point: " + endPoint.toString());
    }

}
