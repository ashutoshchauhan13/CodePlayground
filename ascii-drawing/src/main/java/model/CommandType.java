package model;

import java.util.HashMap;
import java.util.Map;

public enum CommandType {

    CANVAS("C", 2), LINE("L", 4), RECTANGLE("R", 4), FILL("B", 3), QUIT("Q", 0), POINT("P",2);

    private static final Map<String, CommandType> lookup = new HashMap<>();

    static {
        for (CommandType t : CommandType.values()) {
            lookup.put(t.commandChar, t);
        }
    }

    private final String commandChar;

    public int getNumberOfParametersAllowed() {
        return numberOfParametersAllowed;
    }

    private final int numberOfParametersAllowed;

    private CommandType(String commandChar, int numberOfParametersAllowed) {
        this.commandChar = commandChar;
        this.numberOfParametersAllowed = numberOfParametersAllowed;
    }


    public String toString() {
        return this.commandChar;
    }

    public static CommandType get(String commandChar) {
        return lookup.get(commandChar);
    }
}

