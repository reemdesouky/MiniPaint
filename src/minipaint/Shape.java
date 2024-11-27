package minipaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

public interface Shape {
    public void setPosition(Point position);
    public Point getPosition();
    

    public void setProperties(Map<String, Double> properties);
    public Map<String, Double> getProperties();
    public void setColor(Color color);
    public Color getColor();
    public void setFillColor(Color color);
    public Color getFillColor();
    public void draw(java.awt.Graphics canvas);
    public void colorize(Graphics canvas);
    @Override
    public String toString();
}

