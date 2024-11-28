package minipaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public class Square extends isShape {

    public Square() {
    }

    @Override
    public void draw(Graphics canvas) {
        Color color = super.getColor();
        canvas.setColor(color);
        Point position = super.getPosition();
        double sideLength = super.getProperties().get("length");
        canvas.drawRect(position.x, position.y, (int) sideLength, (int) sideLength);
    }

    @Override
    public void colorize(Graphics canvas) {
        if (super.getFillColor() != null) {
            Color color = super.getFillColor();
            canvas.setColor(color);
            Point position = super.getPosition();
            double sideLength = super.getProperties().get("length");
            canvas.fillRect(position.x, position.y, (int) sideLength, (int) sideLength);
        }
    }

    @Override
    public String toString() {
        String line ="Square," + super.getPosition().x+","+ super.getPosition().y +","+ super.getProperties().get("length")+","+super.getColor().getRed()+","+getColor().getBlue()+","+getColor().getGreen()+",";
        if (super.getFillColor()!=null)
            line+=super.getFillColor().getRed()+","+super.getFillColor().getGreen()+","+super.getFillColor().getBlue();
        else line+="-1";
        return line;
    }

}
