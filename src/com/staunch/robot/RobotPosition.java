package com.staunch.robot;


/**
 * This class holds the RobotPosition
 *
 * @author Ashutosh Chauhan
 * @version 0.1
 */

public class RobotPosition {


    private int xCoordinate;
    private int yCoordinate;
    private char orientation;

    public RobotPosition(int xCoordinate, int yCoordinate, char orientation) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.orientation = orientation;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public char getOrientation() {
        return orientation;
    }

    public void setOrientation(char orientation) {
        this.orientation = orientation;
    }

    public void printCurrentPosition() {
        System.out.println("\n\nx: " + xCoordinate + " y: " + yCoordinate + " orientation: " + orientation);
    }

    public void incrementXCoordinate() {
        xCoordinate++;
    }

    public void incrementYCoordinate() {
        yCoordinate++;
    }

    public void decreaseXCoordinate() {
        xCoordinate--;
    }

    public void decreaseYCoordinate() {
        yCoordinate--;
    }

    public String getOrientationDirection() {
        switch (orientation){
            case 'N':
                return 	"\u2191";
            case 'E':
                return "\u2192";
            case 'S':
                return "\u2193";
            case 'W':
                return "\u2190";
        }
        return "";
    }
}
