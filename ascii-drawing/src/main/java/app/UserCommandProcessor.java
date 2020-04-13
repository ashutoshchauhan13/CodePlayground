package app;


import canvas.AsciiCanvas;
import canvas.Canvas;
import commands.Command;
import model.CommandType;
import commands.CreateCommand;
import utils.CharacterPrinter;

public class UserCommandProcessor implements CommandProcessor {

    private Canvas canvas;

    @Override
    public void executeCommand(String[] userInputCommand) {
        UserInputParser userInputParser = new UserInputParser();
        CommandType commandType = userInputParser.toCommand(userInputCommand);
        // Create command is a special command where we create the canvas
        // Any other command we just execute
        if(commandType == CommandType.CANVAS){
            CreateCommand createCommand = (CreateCommand)userInputParser.createCommand(userInputCommand);
            canvas = new AsciiCanvas(createCommand.getCanvasBoundary(), new CharacterPrinter());
            canvas.render(createCommand);
        }
        else{
            if(canvas == null){
                throw new IllegalStateException("Canvas is not yet created - can not execute this command");
            }
            Command command = userInputParser.createCommand(userInputCommand);
            canvas.render(command);
        }

    }
}
