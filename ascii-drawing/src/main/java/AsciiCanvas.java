import java.util.Arrays;

public class AsciiCanvas implements Canvas {

    private static final char EMPTY_CHAR = ' ';
    private static final char H_EDGE_CHAR = '-';
    private static final char V_EDGE_CHAR = '|';
    private static final char LINE_CHAR = 'x';
    private int width;
    private int height;
    private char[][] pixels;
    private CharacterPrinter characterPrinter;
    private boolean created = false;

    public void initializeCanvas(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("canvas width and height must be positive value");
        }
        this.width = width+2;
        this.height = height+2;
        this.pixels = new char[this.height][this.width];
        initialize();
        created = true;
    }

    private void initialize() {
        for (char[] line : pixels) {
            Arrays.fill(line, EMPTY_CHAR);
        }
        fillHorizontalLine(0, 0, width-1, H_EDGE_CHAR);
        fillHorizontalLine(height-1, 0, width-1, H_EDGE_CHAR);
        fillVerticalLine(0, 1, height-2, V_EDGE_CHAR);
        fillVerticalLine(width-1, 1, height-2, V_EDGE_CHAR);
        characterPrinter= new CharacterPrinter();
    }

    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        validatePositive(x1, y1, x2, y2);
        validateXBound(x1, x2);
        validateYBound(y1, y2);
        if (x1 == x2) {
            fillVerticalLine(x1, y1, y2, LINE_CHAR);
        } else if (y1 == y2) {
            fillHorizontalLine(y1, x1, x2, LINE_CHAR);
        } else {
            throw new UnsupportedOperationException("Invalid values: not yet supported");
        }
    }

    @Override
    public void drawRectangle(int x1, int y1, int x2, int y2) {
        validatePositive(x1, y1, x2, y2);
        validateXBound(x1, x2);
        validateYBound(y1, y2);
        ensureRightGreaterThanLeft(x1, x2);
        ensureRightGreaterThanLeft(y1, y2);
        fillHorizontalLine(y1, x1, x2, LINE_CHAR);
        fillHorizontalLine(y2, x1, x2, LINE_CHAR);
        fillVerticalLine(x1, y1+1, y2-1, LINE_CHAR);
        fillVerticalLine(x2, y1+1, y2-1, LINE_CHAR);
    }


    @Override
    public void render() {
        characterPrinter.printLines(pixels);
    }

    private void validateYBound(int... parameters) {
        for (int parameter : parameters) {
            if (parameter > this.height - 2) {
                throw new IllegalArgumentException("parameter out of canvas height: " + parameter);
            }
        }
    }

    private void validateXBound(int... parameters) {
        for (int parameter : parameters) {
            if (parameter > this.width - 2) {
                throw new IllegalArgumentException("parameter out of canvas width: " + parameter);
            }
        }
    }

    private void ensureRightGreaterThanLeft(int left, int right) {
        if (left >= right) {
            throw new IllegalArgumentException("coordinate positions are wrong: (" + left + ", " + right + ")");
        }
    }

    private void validatePositive(int... parameters) {
        for (int parameter : parameters) {
            if (parameter <= 0) {
                throw new IllegalArgumentException("parameter must be positive number: " + parameter);
            }
        }
    }

    private void fillHorizontalLine(int y, int begin, int end, char p) {
        fillLine(y, begin, end, p, true);
    }

    private void fillVerticalLine(int x, int begin, int end, char p) {
        fillLine(x, begin, end, p, false);
    }

    private void fillLine(int fixed, int begin, int end, char p, boolean horizontal) {
        if (begin > end) {
            begin = begin ^ end;
            end = begin ^ end;
            begin = begin ^ end;
        }
        for(int i=begin; i<=end; i++) {
            if (horizontal) {
                pixels[fixed][i] = p;
            } else {
                pixels[i][fixed] = p;
            }

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AsciiCanvas canvas = (AsciiCanvas) o;
        return Arrays.deepEquals(pixels, canvas.pixels);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(pixels);
    }

    public boolean isCreated() {
        return created;
    }

}
