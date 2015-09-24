package com.tac.kulik;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        Object[] objs = new Object[10];

        File dir = new File("/home/kulik/projects/course/proj2/");
        File inputFile = new File(dir, "input.txt");
        FileInputStream fis = new FileInputStream(inputFile);
        Scanner scaner = new Scanner(fis);
        parse(objs, scaner);
        
        System.out.println("The End");
    }

    private static void parse(Object[] objs, Scanner scaner) {
        int i = 0;
        while (scaner.hasNextLine()) {
            String line = scaner.nextLine();
            if (line != null && !line.equals("")) {
                JSONObject jsonObject = (JSONObject) JSONValue.parse(line);
                String type = (String) jsonObject.get("type");
                if ("Rectangle".equals(type)) {
                    Long point1x = (Long) jsonObject.get("point1X");
                    Long point1y = (Long) jsonObject.get("point1Y");
                    Long point2x = (Long) jsonObject.get("point2X");
                    Long point2y = (Long) jsonObject.get("point2Y");
                    Rectangle r = new Rectangle();
                    r.setStartPoint(new Point(point1x.intValue(), point1y.intValue()));
                    r.setEndPoint(new Point(point2x.intValue(), point2y.intValue()));
                    objs[i] = r;
                } else if ("Circle".equals(type)) {
                    Long point1x = (Long) jsonObject.get("point1X");
                    Long point1y = (Long) jsonObject.get("point1Y");
                    Long radius = (Long) jsonObject.get("radius");
                    Circle circle = new Circle();
                    circle.setCenter(new Point(point1x.intValue(), point1y.intValue()));
                    circle.setRadius(radius.intValue());
                    objs[i] = circle;
                } else if ("Line".equals(type)) {
                    Long point1x = (Long) jsonObject.get("point1X");
                    Long point1y = (Long) jsonObject.get("point1Y");
                    Long point2x = (Long) jsonObject.get("point2X");
                    Long point2y = (Long) jsonObject.get("point2Y");
                    Line l = new Line();
                    l.setStartPoint(new Point(point1x.intValue(), point1y.intValue()));
                    l.setEndPoint(new Point(point2x.intValue(), point2y.intValue()));
                    objs[i] = l;
                }
                i++;
            }
        }
    }
}
