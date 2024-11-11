package minipaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

abstract public class isShape implements Shape {

    private Point position;
    private Map<String, Double> properties = new HashMap<>();
    private Color color;
    private Color fillColor;

    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties.putAll(properties);
    }

    @Override
    public Map<String, Double> getProperties() {
        if (this.properties != null) {
            return properties;
        }
        return null;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }

    @Override
    abstract public void draw(Graphics canvas);

    @Override
    abstract public void colorize(Graphics canvas);

}
