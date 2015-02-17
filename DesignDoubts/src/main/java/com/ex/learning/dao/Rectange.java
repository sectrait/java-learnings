/**
 * This code is copyright and property of Vizury Interactive
 */
package com.ex.learning.dao;

/**
 * @author Varun Pahwa <varun.pahwa@vizury.com>
 * @since 17-Feb-2015
 */
public class Rectange extends Shape {
    private int width;
    private int height;

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

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectange(int width, int height) {
        this.width = width;
        this.height = height;
    }

    protected enum parameters {
        borderLineColor, fillColor, width, height;

        public static parameters getParameter(String key) {
            for (parameters parameter : parameters.values()) {
                if (parameter.name().equals(key)) {
                    return parameter;
                }
            }
            return null;
        }
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
        } else if (data != null && data.equals(parameters.fillColor)) {
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
        if (data != null && data.equals(parameters.width)) {
            return getWidth();
        } else if (data != null && data.equals(parameters.height)) {
            return getHeight();
        } else {
            return defaultValue;
        }
    }

}