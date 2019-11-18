package com.staunch;

import com.staunch.command.Command;
import com.staunch.command.ForwardCommand;
import com.staunch.command.LeftRotationCommand;
import com.staunch.command.RightRotationCommand;
import com.staunch.grid.Grid;
import com.staunch.robot.MartianRobot;
import com.staunch.robot.RobotPosition;


public class Main {

    private static int xStartingCoordinate = 0;
    private static int yStartingCoordinate = 0;
    private static char orientation = 'S';
    private static String commandSequence = "";

    public static void main(String[] args) {
        Grid martianPlane = new Grid(5, 3);
        martianPlane.printGrid();

        parseArguments(args);

        MartianRobot martianRobot = new MartianRobot(new RobotPosition(xStartingCoordinate,yStartingCoordinate,orientation));
        System.out.println("<<============================== Starting Robot Position ==============================>>");

        martianRobot.getRobotPosition().printCurrentPosition();
        martianPlane.printGrid(martianRobot.getRobotPosition());

        sendCommandsToMartianRobot(martianRobot, martianPlane);
    }

    private static void parseArguments(String[] args) throws IllegalArgumentException{
        if (args.length > 0) {
            try {
                xStartingCoordinate = Integer.parseInt(args[0]);

            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
            try {
                yStartingCoordinate = Integer.parseInt(args[1]);

            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[1] + " must be an integer.");
                System.exit(1);
            }
            orientation =   args[2].charAt(0);
            commandSequence= args[3];
            if ( commandSequence.length()>100){
                throw new IllegalArgumentException("Command instruction can not be above 100");
            }
            System.out.println(commandSequence);
        }
    }

    private static void sendCommandsToMartianRobot(MartianRobot martianRobot, Grid martianPlane){
        System.out.println("<<============================== Command Start ==============================>>");
        for(char commandInstruction: commandSequence.toCharArray())
        {
            Command command = getCommandFromCommandChar(commandInstruction);
            System.out.print("Command given: "+ command.getCommandCharacter() +  "\t");
            RobotPosition robotPosition = deepCopyRobotPosition(martianRobot);
            martianRobot.executeCommand(command);
            checkIfRobotIsStillOnThePlane(martianRobot, martianPlane, robotPosition);
            martianPlane.printGrid(martianRobot.getRobotPosition());

            System.out.println("------------------------------------------------------------");
        }
        martianRobot.printAllLostPositions();
        System.out.println("<<============================== Command End ==============================>>");
    }

    private static void checkIfRobotIsStillOnThePlane(MartianRobot martianRobot, Grid martianPlane, RobotPosition robotPosition) {
        if(martianPlane.getXCoordinateLimit()< martianRobot.getRobotPosition().getXCoordinate()
                || martianPlane.getYCoordinateLimit()< martianRobot.getRobotPosition().getYCoordinate()){
            martianRobot.addLostPosition(robotPosition);
            martianRobot.printAllLostPositions();
            throw new IllegalStateException("Robot has been LOST");
        }
    }

    private static RobotPosition deepCopyRobotPosition(MartianRobot martianRobot) {
        return new RobotPosition(martianRobot.getRobotPosition().getXCoordinate(),
                        martianRobot.getRobotPosition().getYCoordinate(),
                        martianRobot.getRobotPosition().getOrientation()
                );
    }


    private static Command getCommandFromCommandChar(char commandInstruction){
        switch (commandInstruction){
            case 'L':
                return new LeftRotationCommand();
            case 'R':
                return new RightRotationCommand();
            case 'F':
                return new ForwardCommand();
            default:
                throw new IllegalStateException("Unexpected commandInstruction: ");
        }
    }

}