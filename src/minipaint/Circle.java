package minipaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public class Circle extends isShape {

    public Circle() {
    }

    @Override
    public void draw(Graphics canvas) {
        Color color = super.getColor();
        canvas.setColor(color);
        Point position = super.getPosition();
        double radius = super.getProperties().get("radius");
        canvas.drawOval(position.x, position.y, (int) radius * 2, (int) radius * 2);
    }

    @Override
    public void colorize(Graphics canvas) {
        if (super.getFillColor() != null) {
            Color color = super.getFillColor();
            canvas.setColor(color);
            Point position = super.getPosition();
            double radius = super.getProperties().get("radius");
            canvas.fillOval(position.x, position.y, (int) radius * 2, (int) radius * 2);
        }
    }
    
    @Override
    public String toString() {
        String line= "Circle," + super.getPosition().x+","+ super.getPosition().y +","+ super.getProperties().get("radius")+","+super.getColor().toString()+",";
        if (super.getFillColor()!=null)
            line+=super.getFillColor().toString();
        else line+="-1";
        return line;
    }

}
