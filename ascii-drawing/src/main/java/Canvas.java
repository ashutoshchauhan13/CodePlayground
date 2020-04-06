public interface Canvas {

    void initializeCanvas(int width, int height);

    void drawLine(int x1, int y1, int x2, int y2);

    void drawRectangle(int x1, int y1, int x2, int y2);

    void render();

    boolean isCreated();

}
