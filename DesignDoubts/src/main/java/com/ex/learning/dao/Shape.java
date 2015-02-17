/**
 * This code is copyright and property of Vizury Interactive
 */
package com.ex.learning.dao;

/**
 * @author Varun Pahwa <varun.pahwa@vizury.com>
 * @since 17-Feb-2015
 */
public abstract class Shape {
    private String borderLineColor;
    private String fillColor;

    protected enum parameters {
        borderLineColor, fillColor;
        public static parameters getParameter(String key) {
            for (parameters parameter : parameters.values()) {
                if (parameter.name().equals(key)) {
                    return parameter;
                }
            }
            return null;
        }
    }

    public String getBorderLineColor() {
        return borderLineColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setBorderLineColor(String borderLineColor) {
        this.borderLineColor = borderLineColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public abstract String getParameter(String key, String defaultValue);

    public abstract int getParameter(String key, int defaultValue);

    public abstract int getArea();

    public abstract int getPerimeter();
}