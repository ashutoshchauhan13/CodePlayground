package com.staunch.command;

import com.staunch.robot.RobotPosition;

public class RightRotationCommand implements Command {

    public char getCommandCharacter() {
        return 'R';
    }

    public String tellMeHowYouOperate() {
        String message = "I make clock wise turn";
        System.out.println(message);
        return message;
    }

    public RobotPosition processCommand(RobotPosition robotPosition) {
        System.out.print("Let's Turn Clockwise");
        char newOrientation;
        switch (robotPosition.getOrientation()) {
            case 'N':
                newOrientation = 'E';
                break;
            case 'E':
                newOrientation = 'S';
                break;
            case 'S':
                newOrientation = 'W';
                break;
            case 'W':
                newOrientation = 'N';
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + robotPosition.getOrientation());
        }
        robotPosition.setOrientation(newOrientation);
        return robotPosition;
    }
}
