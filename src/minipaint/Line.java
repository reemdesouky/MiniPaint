package minipaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

public class Line extends isShape{

    public Line() {
    }

     @Override
    public void draw(Graphics canvas) {
        Color color = super.getColor();
        canvas.setColor(color);
        Point position=super.getPosition();
        double length=super.getProperties().get("length");
        canvas.drawLine(position.x, position.y, position.x + (int)length, position.y+(int)length);
    }

    @Override
    public void colorize(Graphics canvas) {

    }
    
    @Override
    public String toString() {
        return "Line," + super.getPosition().x+","+ super.getPosition().y +","+ super.getProperties().get("length")+","+super.getColor().toString()+",-1";
    }
}
