import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("-------- Coding Problem: Drawing Program ----------");
        System.out.print("enter command: ");
        Scanner scanner = new Scanner(System.in);
        CommandProcessor commandProcessor = new UserCommandProcessor();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            String[] userInputCommand = line.split("\\s+");
            try {
                commandProcessor.executeCommand(userInputCommand);
            } catch (Exception ex) {
                System.out.print(ex.getMessage());
            }
            System.out.print("\n Enter your command: ");
        }
    }
}
