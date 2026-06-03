package commands;

/**
 * Command Interface - follows Command Pattern
 * Single Responsibility: Define contract for all executable commands
 */
public interface Command {
    /**
     * Executes the command operation
     */
    void execute();

    /**
     * Returns true if the command should terminate the program
     */
    boolean isTerminating();
}
