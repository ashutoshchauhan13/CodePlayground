package com.staunch.command;

import com.staunch.robot.RobotPosition;

/**
 * This interface defines Command Instruction - this can be used to create different commands
 * @version 0.1
 * @author Ashutosh Chauhan
 */

public interface Command {
    char getCommandCharacter();

    String tellMeHowYouOperate();

    RobotPosition processCommand(RobotPosition robotPosition);
}
