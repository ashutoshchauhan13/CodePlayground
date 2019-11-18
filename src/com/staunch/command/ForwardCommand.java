package com.staunch.command;

import com.staunch.robot.RobotPosition;

public class ForwardCommand implements Command {

    public char getCommandCharacter() {
        return 'F';
    }

    public String tellMeHowYouOperate() {
        String message = "I move forward while retaining the rotation";
        System.out.println(message);
        return message;
    }

    public RobotPosition processCommand(RobotPosition robotPosition) {
        System.out.print("Let's Move Forward");
        char orientation = robotPosition.getOrientation();
        switch (orientation) {
            case 'N':
                robotPosition.incrementYCoordinate();
                break;
            case 'E':
                robotPosition.incrementXCoordinate();
                break;
            case 'S':
                robotPosition.decreaseYCoordinate();
                break;
            case 'W':
                robotPosition.decreaseXCoordinate();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + robotPosition.getOrientation());
        }
        return robotPosition;
    }
}
