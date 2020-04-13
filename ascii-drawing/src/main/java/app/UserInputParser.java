package app;

import commands.*;
import model.CommandType;

import static model.CommandType.*;

public class UserInputParser {

    public Command createCommand(String[] userInputCommands) {
        CommandType commandType = get(userInputCommands[0].toUpperCase());
        validateCommand(commandType,userInputCommands);
        switch (commandType) {
            case CANVAS:
                return new CreateCommand(Integer.parseInt(userInputCommands[1]), Integer.parseInt(userInputCommands[2]));
            case LINE:
                return new LineCommand(Integer.parseInt(userInputCommands[1]),Integer.parseInt(userInputCommands[2]),Integer.parseInt(userInputCommands[3]),Integer.parseInt(userInputCommands[4]));
            case RECTANGLE:
                return new RectangleCommand(Integer.parseInt(userInputCommands[1]),Integer.parseInt(userInputCommands[2]),Integer.parseInt(userInputCommands[3]),Integer.parseInt(userInputCommands[4]));
            case QUIT:
                return new QuitCommand();
            default:
                throw new IllegalStateException("Unexpected value: " + userInputCommands[0].toUpperCase());
        }
    }

    public CommandType toCommand(String[] userInputCommands) {
        CommandType commandType = get(userInputCommands[0].toUpperCase());
        return commandType;
    }


    private void validateCommand(CommandType commandType, String[] userInputCommands) {
        if (userInputCommands.length != commandType.getNumberOfParametersAllowed()) {
            throw new IllegalArgumentException("expecting " + commandType.getNumberOfParametersAllowed() + " parameters for create canvas command");
        }
    }

}
