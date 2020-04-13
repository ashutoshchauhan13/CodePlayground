package canvas;

import commands.Command;
import utils.CharacterPrinter;

public class AsciiCanvas implements Canvas {


    private char[][] pixels;
    private CharacterPrinter characterPrinter;

    public AsciiCanvas(char[][] pixels, CharacterPrinter characterPrinter) {
        this.pixels = pixels;
        this.characterPrinter = characterPrinter;
    }

    @Override
    public void render(Command command) {
        this.pixels = command.populatePixels(pixels);
        characterPrinter.printLines(pixels);
    }

}
