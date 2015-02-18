/**
 * This code is copyright and property of Vizury Interactive
 */
package com.ex.learning.eav;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Varun Pahwa <varun.pahwa@vizury.com>
 * @since 18-Feb-2015
 */
public class ShapeDao {
    
    public static void main(String args[]) {
        Map<ValidShapes,List<Map<ValidAttributes,String> > > eavData = new HashMap<ValidShapes, List<Map<ValidAttributes,String>>>();
        
        Map<ValidAttributes,String> rectangle1 = new HashMap<ValidAttributes, String>();
        
        rectangle1.put(ValidAttributes.borderLineColor,"a");
        rectangle1.put(ValidAttributes.fillColor,"b");
        rectangle1.put(ValidAttributes.height, "1");
        rectangle1.put(ValidAttributes.width, "2");
        
        Map<ValidAttributes,String> rectangle2 = new HashMap<ValidAttributes, String>();
        
        rectangle2.put(ValidAttributes.borderLineColor,"b");
        rectangle2.put(ValidAttributes.fillColor,"c");
        rectangle2.put(ValidAttributes.height, "3");
        rectangle2.put(ValidAttributes.width, "5");
        
        List<Map<ValidAttributes, String> > rectangleList = new ArrayList<Map<ValidAttributes,String>>();
        
        rectangleList.add(rectangle1);
        rectangleList.add(rectangle2);
        
        Map<ValidAttributes,String> circle1 = new HashMap<ValidAttributes, String>();
        
        circle1.put(ValidAttributes.borderLineColor,"a");
        circle1.put(ValidAttributes.fillColor,"b");
        circle1.put(ValidAttributes.radius, "1");
        
        Map<ValidAttributes,String> circle2 = new HashMap<ValidAttributes, String>();
        
        circle2.put(ValidAttributes.borderLineColor,"b");
        circle2.put(ValidAttributes.fillColor,"c");
        circle2.put(ValidAttributes.radius, "5");
    
        List<Map<ValidAttributes, String> > circleList = new ArrayList<Map<ValidAttributes,String>>();
        
        circleList.add(circle1);
        circleList.add(circle2);
        
        eavData.put(ValidShapes.Rectangle,rectangleList);
        eavData.put(ValidShapes.Circle,circleList);
        
        System.out.println(eavData);
    }
}
