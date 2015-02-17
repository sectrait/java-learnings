package com.ex.learning;

import java.util.ArrayList;
import java.util.List;

import com.ex.learning.dao.Circle;
import com.ex.learning.dao.Rectange;
import com.ex.learning.dao.Shape;

/**
 * 
 * @author Varun Pahwa <varun.pahwa@vizury.com>
 * @since 17-Feb-2015
 */
public class App {
    public static void main( String[] args ) {
        List<Shape> dataShape = new ArrayList<Shape>();
        
        Shape rectange = new Rectange(1,2);
        Shape circle = new Circle(1);
        
        dataShape.add(rectange);
        dataShape.add(circle);
        
        for(Shape shape : dataShape) {
            // here how to print the width and height ?
            System.out.println(shape.getArea());
            System.out.println(shape.getParameter("radius",-1));
            System.out.println(shape.getParameter("width",-1));
            System.out.println(shape.getParameter("height",-1));
        }
    }
}