package minipaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public class Rectangle extends isShape {

    public Rectangle() {
    }

    @Override
    public void draw(Graphics canvas) {
        Color color = super.getColor();
        canvas.setColor(color);
        Point position = super.getPosition();
        double height = super.getProperties().get("height");
        double width = super.getProperties().get("width");
        canvas.drawRect(position.x, position.y,(int)width , (int) height);
    }

    @Override
    public void colorize(Graphics canvas) {
        if (super.getFillColor() != null) {
            Color color = super.getFillColor();
            canvas.setColor(color);
            Point position = super.getPosition();
            double height = super.getProperties().get("height");
            double width = super.getProperties().get("width");
            canvas.fillRect(position.x, position.y,(int) width, (int) height);
        }
    }

}
