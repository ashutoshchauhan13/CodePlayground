package com.staunch;

import com.staunch.command.Command;
import com.staunch.command.ForwardCommand;
import com.staunch.command.LeftRotationCommand;
import com.staunch.command.RightRotationCommand;
import com.staunch.grid.Grid;


public class Main {

    //TODO: martial plane grid value is hardcoded but can be adapted to pass it through parameters
    private static final int X_COORDINATE_LIMIT = 5;
    private static final int Y_COORDINATE_LIMIT = 3;
    private static int xStartingCoordinate = 0;
    private static int yStartingCoordinate = 0;
    private static char orientation = 'S';
    private static String commandSequence = "";

    public static void main(String[] args) {
        Grid martianPlane = new Grid(X_COORDINATE_LIMIT, Y_COORDINATE_LIMIT);

        martianPlane.printGrid();

        parseArguments(args);

    }

    private static void parseArguments(String[] args) throws IllegalArgumentException {
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
            orientation = args[2].charAt(0);
            commandSequence = args[3];
            if (commandSequence.length() > 100) {
                throw new IllegalArgumentException("Command instruction can not be above 100");
            }
            System.out.println(commandSequence);
        }
    }


    private static Command getCommandFromCommandChar(char commandInstruction) {
        switch (commandInstruction) {
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
