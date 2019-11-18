package com.staunch.robot;

import com.staunch.command.Command;

import java.util.ArrayList;
import java.util.List;

public class MartianRobot {

    private RobotPosition robotPosition;
    private static List<RobotPosition> lostPositions = new ArrayList<>();

    public MartianRobot(RobotPosition robotPosition) {
        this.robotPosition = robotPosition;
        this.robotPosition.printCurrentPosition();
    }

    public void executeCommand(Command command) {
        command.tellMeHowYouOperate();
        command.processCommand(robotPosition);
        robotPosition.printCurrentPosition();
    }

    public RobotPosition getRobotPosition() {
        return robotPosition;
    }

    public void addLostPosition(RobotPosition lostPosition){
        lostPositions.add(lostPosition);
    }

    public void printAllLostPositions(){
        System.out.println("Lost positions = "+ lostPositions);
    }

}

