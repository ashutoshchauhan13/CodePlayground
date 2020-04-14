import commands.*;
import model.CommandType;

import static model.CommandType.*;

public class CommandFactory {

    public Command createCommand(String[] userInputCommands) {
        CommandType commandType = get(userInputCommands[0].toUpperCase());
        switch (commandType) {
            case CANVAS:
                return new CreateCommand(Integer.parseInt(userInputCommands[1]), Integer.parseInt(userInputCommands[2]));
            case LINE:
                return new LineCommand(Integer.parseInt(userInputCommands[1]),Integer.parseInt(userInputCommands[2]),Integer.parseInt(userInputCommands[3]),Integer.parseInt(userInputCommands[4]));
            case RECTANGLE:
                return new RectangleCommand(Integer.parseInt(userInputCommands[1]),Integer.parseInt(userInputCommands[2]),Integer.parseInt(userInputCommands[3]),Integer.parseInt(userInputCommands[4]));
            case POINT:
                return new PointCommand(Integer.parseInt(userInputCommands[1]), Integer.parseInt(userInputCommands[2]));
            case QUIT:
                return new QuitCommand();
            default:
                throw new IllegalStateException("Unexpected value: " + userInputCommands[0].toUpperCase());
        }
    }

}
