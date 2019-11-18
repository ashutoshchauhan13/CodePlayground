package com.staunch.robot;

import com.staunch.command.Command;

public class MartianRobot {

    private RobotPosition robotPosition;

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

}

