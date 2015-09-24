package com.tac.kulik;

import java.util.Iterator;

/**
 * Created by kulik on 22.05.15.
 */
public class ArrayIteratorWrapper implements Iterator<Point> {
    private Point[] points;
    int currentPosition = 0;

    public ArrayIteratorWrapper(Point[] points) {
        this.points = points;
    }

    @Override
    public boolean hasNext() {
        return (points.length > currentPosition);
    }

    @Override
    public Point next() {
        return points[currentPosition++];
    }

    @Override
    public void remove() {

    }

}
