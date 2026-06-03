package model;

/**
 * Drawing Context - follows Single Responsibility Principle
 * Responsible for maintaining the current state of the drawing session
 */
public class DrawingContext {
    private Canvas canvas;

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public boolean hasCanvas() {
        return canvas != null;
    }
}
