/**
 * This code is copyright and property of Vizury Interactive
 */
package com.ex.learning.dao;

/**
 * @author Varun Pahwa <varun.pahwa@vizury.com>
 * @since 17-Feb-2015
 */
public class Circle extends Shape {
    private int radius;

    public static parameters getParameter(String key) {
        for (parameters parameter : parameters.values()) {
            if (parameter.name().equals(key)) {
                return parameter;
            }
        }
        return null;
    }

    protected enum parameters {
        borderLineColor, fillColor, radius;

        public static parameters getParameter(String key) {
            for (parameters parameter : parameters.values()) {
                if (parameter.name().equals(key)) {
                    return parameter;
                }
            }
            return null;
        }
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ex.learning.dao.Shape#getArea()
     */
    @Override
    public int getArea() {
        // TODO Auto-generated method stub
        return 0;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ex.learning.dao.Shape#getPerimeter()
     */
    @Override
    public int getPerimeter() {
        // TODO Auto-generated method stub
        return 0;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ex.learning.dao.Shape#getParameter(java.lang.String,
     * java.lang.String)
     */
    @Override
    public String getParameter(String key, String defaultValue) {
        parameters data = parameters.getParameter(key);
        if (data != null && data.equals(parameters.borderLineColor)) {
            return getBorderLineColor();
        } else if (data.equals(parameters.fillColor)) {
            return getFillColor();
        } else {
            return defaultValue;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.ex.learning.dao.Shape#getParameter(java.lang.String, int)
     */
    @Override
    public int getParameter(String key, int defaultValue) {
        parameters data = parameters.getParameter(key);
        if (data != null && data.equals(parameters.radius)) {
            return getRadius();
        } else {
            return defaultValue;
        }
    }
}
