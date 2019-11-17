package com.staunch.command;

import com.staunch.robot.RobotPosition;

public class RightRotationCommand implements Command {

    public char getCommandCharacter() {
        return 'R';
    }

    public String tellMeHowYouOperate() {
        return "";
    }

    public RobotPosition processCommand(RobotPosition robotPosition) {
        return null;
    }
}
