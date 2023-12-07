package com.tankwar.core;

import android.graphics.Canvas;

/**
 A Layer is an abstract class representing a visual element of a game. Each
 Layer has position (in terms of the upper-left corner of its visual bounds),
 width, height, and can be made visible or invisible. Layer subclasses must
 implement a paint(Canvas) method so that they can be rendered.
 <hr>
 <b>&copy; Copyright 2010 Guidebee Pty Ltd. All Rights Reserved.</b>
 @version 1.00, 12/08/10
 @author Guidebee Pty Ltd.
 */
public abstract class Layer {
    private int width;
    private int height;
    private int x;
    private int y;
    private boolean visible;

    /**
     Constructor.
     @param x  the top left x postion
     @param y  the top left y postion
     @param width the width of the layer
     @param height the height of the layer
     @param visible visialbe or not
     @roseuid 6527959602D1
     */
    protected Layer(int x, int y, int width, int height, boolean visible) {
        setSize(width,height);
        setPosition(x,y);
        setVisible(visible);
    }

    /**
     set the layer size.
     @param width  the width of the layer
     @param height the height of the layer
     @roseuid 6527959602DE
     */
    protected void setSize(int width, int height) {
        if (width < 1 || height < 1)
            throw new IllegalArgumentException();

        this.width = width;
        this.height = height;
    }

    /**
     Gets the current width of this layer, in pixels.
     @return the width of the layer.
     @roseuid 6527959602E7
     */
    public final int getWidth() {
        return width;
    }

    /**
     Gets the current height of this layer, in pixels.
     @return the height of the layer
     @roseuid 6527959602EF
     */
    public final int getHeight() {
        return height;
    }

    /**
     Gets the horizontal position of this Layer's upper-left corner in the
     painter's coordinate system.
     @return int
     @roseuid 6527959602F6
     */
    public final int getX() {
        return x;
    }

    /**
     Gets the vertical  position of this Layer's upper-left corner in the
     painter's coordinate system.
     @return int
     @roseuid 6527959602FC
     */
    public final int getY() {
        return y;
    }

    /**
     Gets the visibility of this Layer.
     @return boolean
     @roseuid 652795960302
     */
    public final boolean isVisible() {
        return visible;
    }

    /**
     Moves this Layer by the specified horizontal and vertical distances.
     @param dx the distance to move along horizontal axis
     @param dy the distance to move along vertical axis
     @roseuid 652795960307
     */
    public void move(int dx, int dy) {
        synchronized (this) {
            x += dx;
            y += dy;
        }
    }

    /**
     Paints this Layer if it is visible.
     @param g the graphics object for rendering the Layer
     @roseuid 652795960311
     */
    public abstract void paint(Canvas g);

    /**
     Sets this Layer's position such that its upper-left corner is located at
     (x,y) in the painter's coordinate system
     @param x  the horizontal position
     @param y the vertical position
     @roseuid 652795960328
     */
    public void setPosition(int x, int y) {
        synchronized (this) {
            this.x = x;
            this.y = y;
        }
    }

    /**
     Sets the visibility of this Layer.
     @param visible true to make the Layer visible, false to make it invisible
     @roseuid 652795960332
     */
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
