package ClickableObjects;

import java.awt.*;

public class Square extends Figure {

    /**
     * Create new Square
     * @param color circle's color
     * @param width circle's width
     * @param height circle's height
     */

    public Square(Color color, int width, int height) {
        super(color, width, height);
        this.shape = new Rectangle(getRandomNumber(500), getRandomNumber(500), width, height);
    }

    @Override
    public Shape getShape() { return this.shape; }

    @Override
    public Color getColor() { return this.color; }

    @Override
    public boolean isPositive() {
        if(this.color==Color.BLUE)
            return true;
        else
            return false;
    }

}
