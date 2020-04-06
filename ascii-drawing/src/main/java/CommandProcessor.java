
public class CommandProcessor {

    private Canvas canvas;

    public Canvas getCanvas() {
        return canvas;
    }

    public CommandProcessor(Canvas canvas){
        this.canvas = canvas;
    }

    public void processUserCommands( String[] userInputCommands) {
        switch (userInputCommands[0].toUpperCase()) {
            case "C":
                validateCreateCommand(userInputCommands);
                createCanvas(Integer.parseInt(userInputCommands[1]), Integer.parseInt(userInputCommands[2]));
                break;
            case "L":
                validateLineCommand(userInputCommands);
                drawLine(Integer.parseInt(userInputCommands[1]),Integer.parseInt(userInputCommands[2]),Integer.parseInt(userInputCommands[3]),Integer.parseInt(userInputCommands[4]));
                break;
            case "R":
                validateRectangleCommand(userInputCommands);
                drawRectangle(Integer.parseInt(userInputCommands[1]),Integer.parseInt(userInputCommands[2]),Integer.parseInt(userInputCommands[3]),Integer.parseInt(userInputCommands[4]));
                break;
            case "Q":
                System.out.println("We are exiting the process now");
                System.exit(0);

            default:
                throw new IllegalStateException("Unexpected value: " + userInputCommands[0].toUpperCase());
        }
    }

    private void validateCreateCommand(String[] userInputCommands) {
        if (userInputCommands.length != 3) {
            throw new IllegalArgumentException("expecting 2 parameters for create canvas command");
        }
    }

    private void validateLineCommand(String[] userInputCommands) {
        if (!canvas.isCreated()) {
            throw new IllegalStateException("Canvas is not yet created - can not execute this command");
        }
        if (userInputCommands.length != 5) {
            throw new IllegalArgumentException("expecting 4 parameters for draw line command");
        }
    }

    private void validateRectangleCommand(String[] userInputCommands) {
        if (!canvas.isCreated()) {
            throw new IllegalStateException("Canvas is not yet created - can not execute this command");
        }
        if (userInputCommands.length != 5) {
            throw new IllegalArgumentException("expecting 4 parameters for draw rectangle command");
        }
    }


    private void drawRectangle(int x1, int y1, int x2, int y2) {
        canvas.drawRectangle(x1, y1, x2, y2);
    }

    private void drawLine(int x1, int y1, int x2, int y2) {
        canvas.drawLine(x1, y1, x2, y2);
    }

    private void createCanvas(int width, int height) {
        canvas.initializeCanvas(width, height);
    }
}
