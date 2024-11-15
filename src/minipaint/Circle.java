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

}
