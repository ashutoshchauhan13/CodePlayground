package com.staunch;

import com.staunch.grid.Grid;



public class Main {

    private static final int X_COORDINATE_LIMIT = 5;
    private static final int Y_COORDINATE_LIMIT = 3;

    public static void main(String[] args) {
        Grid martianPlane = new Grid(X_COORDINATE_LIMIT, Y_COORDINATE_LIMIT);

        martianPlane.printGrid();
    }
}
