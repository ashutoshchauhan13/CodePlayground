import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;


import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CommandProcessorTest {
    private  CommandProcessor commandProcessor;
    private Canvas mockedCanvas;

    @Before
    public void setUp() throws Exception {
        mockedCanvas = mock(Canvas.class);
        commandProcessor = new CommandProcessor(new AsciiCanvas());
    }

    @Test
    public void testCreateCommandWithInvalidOneParameter() {
        String [] testCommand = {"C"};
        try {
            commandProcessor.processUserCommands(testCommand);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals(ex.getMessage(), "expecting 2 parameters for create canvas command");
        }
    }

    @Test
    public void testCreateCommandWithInvalidTwoParameter() {
        String [] testCommand = {"C", "1"};
        try {
            commandProcessor.processUserCommands(testCommand);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals(ex.getMessage(), "expecting 2 parameters for create canvas command");
        }
    }

    @Test
    public void testLineCommandWithInvalidTwoParameter() {
        preCondition();

        String [] testCommand = {"L","2","3"};
        try {
            commandProcessor.processUserCommands(testCommand);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals(ex.getMessage(), "expecting 4 parameters for draw line command");
        }
    }

    private void preCondition() {
        //Precondition
        String[] createCanvasCommand = {"C", "20", "5"};
        commandProcessor.processUserCommands(createCanvasCommand);
    }

    @Test
    public void testLineCommandWithInvalidThreeParameter() {
        //Precondition
        preCondition();

        String [] testCommand = {"L","2","3"};
        try {
            commandProcessor.processUserCommands(testCommand);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals(ex.getMessage(), "expecting 4 parameters for draw line command");
        }
    }

    @Test
    public void testRectangleCommandWithInvalidOneParameter() {
        //Precondition
        preCondition();

        String [] testCommand = {"R","20","22"};
        try {
            commandProcessor.processUserCommands(testCommand);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals(ex.getMessage(), "expecting 4 parameters for draw rectangle command");
        }
    }

    @Test
    public void testRectangleCommandWithInvalidTwoParameter() {
        //Precondition
        preCondition();

        String [] testCommand = {"R","20","22"};
        try {
            commandProcessor.processUserCommands(testCommand);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException ex) {
            assertEquals(ex.getMessage(), "expecting 4 parameters for draw rectangle command");
        }
    }

    @Test
    public void testLineCommandWithNoCanvasCreated() {
        String [] testCommand = {"L", "14", "1", "18", "3"};
        commandProcessor = new CommandProcessor(new AsciiCanvas());
        try {
            commandProcessor.processUserCommands(testCommand);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals(ex.getMessage(), "Canvas is not yet created - can not execute this command");
        }
    }

    @Test
    public void testRectangleCommandWithNoCanvasCreated() {
        String [] testCommand = {"R", "14", "1", "18", "3"};
        commandProcessor = new CommandProcessor(new AsciiCanvas());
        try {
            commandProcessor.processUserCommands(testCommand);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalStateException ex) {
            assertEquals(ex.getMessage(), "Canvas is not yet created - can not execute this command");
        }
    }

    @Test
    public void testCreateCanvasIsCalledWhenCreateCommandIsPassed() {
        String [] testCommand = {"C", "20", "5"};
        commandProcessor = new CommandProcessor(mockedCanvas);
        commandProcessor.processUserCommands(testCommand);
        Mockito.verify(mockedCanvas).initializeCanvas(Mockito.anyInt(),Mockito.anyInt());
    }


    @Test
    public void testDrawLineIsCalledWhenLineCommandIsPassed() {
        String [] createCommand = {"C", "20", "5"};
        String [] testCommand = {"L", "1", "3", "7","3"};
        when(mockedCanvas.isCreated()).thenReturn(true);
        commandProcessor = new CommandProcessor(mockedCanvas);
        commandProcessor.processUserCommands(createCommand);
        commandProcessor.processUserCommands(testCommand);
        Mockito.verify(mockedCanvas).drawLine(Mockito.anyInt(),Mockito.anyInt(),Mockito.anyInt(),Mockito.anyInt());
    }

    @Test
    public void testDrawRectIsCalledWhenLineCommandIsPassed() {
        String [] createCommand = {"C", "20", "5"};
        String [] testCommand = {"R", "1", "3", "7","3"};
        when(mockedCanvas.isCreated()).thenReturn(true);
        commandProcessor = new CommandProcessor(mockedCanvas);
        commandProcessor.processUserCommands(createCommand);
        commandProcessor.processUserCommands(testCommand);
        Mockito.verify(mockedCanvas).drawRectangle(Mockito.anyInt(),Mockito.anyInt(),Mockito.anyInt(),Mockito.anyInt());
    }

}