package com.staunch.command;

import com.staunch.robot.RobotPosition;

public class LeftRotationCommand implements Command {

    public char getCommandCharacter() {
        return 'L';
    }

    public String tellMeHowYouOperate() {
        String message = "I make anti-clock wise turn";
        System.out.println(message);
        return message;
    }

    public RobotPosition processCommand(RobotPosition robotPosition) {
        System.out.print("Let's Turn Anti-Clockwise");
        char newOrientation;
        switch (robotPosition.getOrientation()) {
            case 'N':
                newOrientation = 'W';
                break;
            case 'E':
                newOrientation = 'N';
                break;
            case 'S':
                newOrientation = 'E';
                break;
            case 'W':
                newOrientation = 'S';
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + robotPosition.getOrientation());
        }
        robotPosition.setOrientation(newOrientation);
        return robotPosition;
    }
}
