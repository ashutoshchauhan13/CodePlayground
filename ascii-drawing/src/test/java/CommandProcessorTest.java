//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mockito;
//
//
//import static org.junit.Assert.*;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//
//public class CommandProcessorTest {
//    private  app.UserInputParser commandProcessor;
//    private canvas.Canvas mockedCanvas;
//
//    @Before
//    public void setUp() throws Exception {
//        mockedCanvas = mock(canvas.Canvas.class);
//        commandProcessor = new app.UserInputParser(new canvas.AsciiCanvas());
//    }
//
//    @Test
//    public void testCreateCommandWithInvalidOneParameter() {
//        String [] testCommand = {"C"};
//        try {
//            commandProcessor.toCommand(testCommand);
//            fail("Expected an IllegalArgumentException to be thrown");
//        } catch (IllegalArgumentException ex) {
//            assertEquals(ex.getMessage(), "expecting 2 parameters for create canvas command");
//        }
//    }
//
//    @Test
//    public void testCreateCommandWithInvalidTwoParameter() {
//        String [] testCommand = {"C", "1"};
//        try {
//            commandProcessor.toCommand(testCommand);
//            fail("Expected an IllegalArgumentException to be thrown");
//        } catch (IllegalArgumentException ex) {
//            assertEquals(ex.getMessage(), "expecting 2 parameters for create canvas command");
//        }
//    }
//
//    @Test
//    public void testLineCommandWithInvalidTwoParameter() {
//        preCondition();
//
//        String [] testCommand = {"L","2","3"};
//        try {
//            commandProcessor.toCommand(testCommand);
//            fail("Expected an IllegalArgumentException to be thrown");
//        } catch (IllegalArgumentException ex) {
//            assertEquals(ex.getMessage(), "expecting 4 parameters for render line command");
//        }
//    }
//
//    private void preCondition() {
//        //Precondition
//        String[] createCanvasCommand = {"C", "20", "5"};
//        commandProcessor.toCommand(createCanvasCommand);
//    }
//
//    @Test
//    public void testLineCommandWithInvalidThreeParameter() {
//        //Precondition
//        preCondition();
//
//        String [] testCommand = {"L","2","3"};
//        try {
//            commandProcessor.toCommand(testCommand);
//            fail("Expected an IllegalArgumentException to be thrown");
//        } catch (IllegalArgumentException ex) {
//            assertEquals(ex.getMessage(), "expecting 4 parameters for render line command");
//        }
//    }
//
//    @Test
//    public void testRectangleCommandWithInvalidOneParameter() {
//        //Precondition
//        preCondition();
//
//        String [] testCommand = {"R","20","22"};
//        try {
//            commandProcessor.toCommand(testCommand);
//            fail("Expected an IllegalArgumentException to be thrown");
//        } catch (IllegalArgumentException ex) {
//            assertEquals(ex.getMessage(), "expecting 4 parameters for render rectangle command");
//        }
//    }
//
//    @Test
//    public void testRectangleCommandWithInvalidTwoParameter() {
//        //Precondition
//        preCondition();
//
//        String [] testCommand = {"R","20","22"};
//        try {
//            commandProcessor.toCommand(testCommand);
//            fail("Expected an IllegalArgumentException to be thrown");
//        } catch (IllegalArgumentException ex) {
//            assertEquals(ex.getMessage(), "expecting 4 parameters for render rectangle command");
//        }
//    }
//
//    @Test
//    public void testLineCommandWithNoCanvasCreated() {
//        String [] testCommand = {"L", "14", "1", "18", "3"};
//        commandProcessor = new app.UserInputParser(new canvas.AsciiCanvas());
//        try {
//            commandProcessor.toCommand(testCommand);
//            fail("Expected an IllegalArgumentException to be thrown");
//        } catch (IllegalStateException ex) {
//            assertEquals(ex.getMessage(), "canvas.Canvas is not yet created - can not execute this command");
//        }
//    }
//
//    @Test
//    public void testRectangleCommandWithNoCanvasCreated() {
//        String [] testCommand = {"R", "14", "1", "18", "3"};
//        commandProcessor = new app.UserInputParser(new canvas.AsciiCanvas());
//        try {
//            commandProcessor.toCommand(testCommand);
//            fail("Expected an IllegalArgumentException to be thrown");
//        } catch (IllegalStateException ex) {
//            assertEquals(ex.getMessage(), "canvas.Canvas is not yet created - can not execute this command");
//        }
//    }
//
//    @Test
//    public void testCreateCanvasIsCalledWhenCreateCommandIsPassed() {
//        String [] testCommand = {"C", "20", "5"};
//        commandProcessor = new app.UserInputParser(mockedCanvas);
//        commandProcessor.toCommand(testCommand);
//        Mockito.verify(mockedCanvas).initializeCanvas(Mockito.anyInt(),Mockito.anyInt());
//    }
//
//
//    @Test
//    public void testDrawLineIsCalledWhenLineCommandIsPassed() {
//        String [] createCommand = {"C", "20", "5"};
//        String [] testCommand = {"L", "1", "3", "7","3"};
//        when(mockedCanvas.isCreated()).thenReturn(true);
//        commandProcessor = new app.UserInputParser(mockedCanvas);
//        commandProcessor.toCommand(createCommand);
//        commandProcessor.toCommand(testCommand);
//        Mockito.verify(mockedCanvas).drawLine(Mockito.anyInt(),Mockito.anyInt(),Mockito.anyInt(),Mockito.anyInt());
//    }
//
//    @Test
//    public void testDrawRectIsCalledWhenLineCommandIsPassed() {
//        String [] createCommand = {"C", "20", "5"};
//        String [] testCommand = {"R", "1", "3", "7","3"};
//        when(mockedCanvas.isCreated()).thenReturn(true);
//        commandProcessor = new app.UserInputParser(mockedCanvas);
//        commandProcessor.toCommand(createCommand);
//        commandProcessor.toCommand(testCommand);
//        Mockito.verify(mockedCanvas).drawRectangle(Mockito.anyInt(),Mockito.anyInt(),Mockito.anyInt(),Mockito.anyInt());
//    }
//
//}