package com.staunch.grid;

import com.staunch.robot.RobotPosition;

/**
 * This class defines the martian rectangular plane
 * This also has methods to print the robot's current position in a grid movement
 *
 * @author Ashutosh Chauhan
 * @version 0.1
 */
public class Grid {

    public static final int maxCoordinateLimit = 50;

    private int xCoordinateLimit;
    private int yCoordinateLimit;

    public Grid(int xCoordinateLimit, int yCoordinateLimit) throws IllegalArgumentException {
        if(!isWithinAcceptableLimits(xCoordinateLimit)){
             throw new IllegalArgumentException("Invalid X Coordinate limit, It should be between 0 and 50 but was supplied :" + xCoordinateLimit);
        }
        if(!isWithinAcceptableLimits(yCoordinateLimit)){

            throw new IllegalArgumentException("Invalid Y Coordinate limit, It should be between 0 and 50 but was supplied :" + yCoordinateLimit);
        }
        this.xCoordinateLimit = xCoordinateLimit;
        this.yCoordinateLimit = yCoordinateLimit;
    }

    public int getXCoordinateLimit() {
        return xCoordinateLimit;
    }

    public int getYCoordinateLimit() {
        return yCoordinateLimit;
    }

    protected boolean isWithinAcceptableLimits(int coordinateLimit){
        return coordinateLimit >= 0 && coordinateLimit <= 50;
    }

    public void printGrid(RobotPosition robotPosition) {
        System.out.println("\n");
        for (int y = yCoordinateLimit; y >= 0; y--) {
            for (int x =0 ; x <=xCoordinateLimit; x++ ) {
                if(robotPosition.getXCoordinate()== x && robotPosition.getYCoordinate() ==y){
                    System.out.print("[" +  x+ "," + y + ":" + robotPosition.getOrientationDirection() + "]" +  "\t");
                }
                else {
                    System.out.print("[     ]" + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public void printGrid() {
        System.out.println("\n");
        for (int y = yCoordinateLimit; y >= 0; y--) {
            for (int x =0 ; x <=xCoordinateLimit; x++ ) {
                System.out.print("[" + x+","+y+ "]" +"\t");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

}
