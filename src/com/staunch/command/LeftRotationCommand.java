package com.staunch.command;

import com.staunch.robot.RobotPosition;

public class LeftRotationCommand implements Command {

    public char getCommandCharacter() {
        return 'L';
    }

    public String tellMeHowYouOperate() {
        return "";
    }

    public RobotPosition processCommand(RobotPosition robotPosition) {
        return null;
    }
}
