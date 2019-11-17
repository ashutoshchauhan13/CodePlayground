package com.staunch.robot;


/**
 * This class holds the RobotPosition
 * @version 0.1
 * @author Ashutosh Chauhan
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

    public void printCurrentPosition(){
        System.out.println("\n\nx: "+ xCoordinate + " y: " + yCoordinate + " orientation: "+ orientation);
    }

}
