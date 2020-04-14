import canvas.AsciiCanvas;
import canvas.Canvas;
import commands.Command;
import model.CommandType;
import commands.CreateCommand;
import utils.CharacterPrinter;

import static model.CommandType.get;

public class UserCommandProcessor implements CommandProcessor {

    private Canvas canvas;

    @Override
    public void executeCommand(String[] userInputCommand) {
        CommandFactory commandFactory = new CommandFactory();
        CommandType commandType = get(userInputCommand[0].toUpperCase());
        validateCommand(commandType,userInputCommand);

        // Create command is a special command where we create the canvas
        // Any other command we just execute
        if(commandType == CommandType.CANVAS){
            CreateCommand createCommand = (CreateCommand) commandFactory.createCommand(userInputCommand);
            canvas = new AsciiCanvas(createCommand.getCanvasBoundary(), new CharacterPrinter());
            canvas.render(createCommand);
        }
        else{
            if(canvas == null){
                throw new IllegalStateException("Canvas is not yet created - can not execute this command");
            }
            Command command = commandFactory.createCommand(userInputCommand);
            canvas.render(command);
        }

    }

    private void validateCommand(CommandType commandType, String[] userInputCommands) {
        if (userInputCommands.length-1 != commandType.getNumberOfParametersAllowed()) {
            throw new IllegalArgumentException("expecting " + commandType.getNumberOfParametersAllowed() + " parameters for this command");
        }
    }
}
