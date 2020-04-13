package utils;

public class CharacterPrinter {

    public void printLines(char[][] lines) {
        for (char[] line : lines) {
            printLine(line);
        }
    }

    public void printLine(char[] line) {
        for (char c : line) {
            System.out.print(c);
        }
        System.out.println();
    }

}
