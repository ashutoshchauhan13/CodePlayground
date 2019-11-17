package com.staunch.command;

import com.staunch.robot.RobotPosition;

public class ForwardCommand implements Command {

    public char getCommandCharacter() {
        return 'F';
    }

    public String tellMeHowYouOperate() {
        return "";
    }

    public RobotPosition processCommand(RobotPosition robotPosition) {
        return null;
    }
}
