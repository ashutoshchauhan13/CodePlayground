package com.staunch.command;

import com.staunch.robot.RobotPosition;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ForwardCommandTest {

    ForwardCommand forwardCommand;
    RobotPosition robotPosition;

    @Before
    public void setUp() throws Exception {
        forwardCommand = new ForwardCommand();
        robotPosition = new RobotPosition(0,0,'E');
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getCommandCharacter() {
        Assert.assertEquals('F', forwardCommand.getCommandCharacter());
    }

    @Test
    public void tellMeHowYouOperate() {
        Assert.assertEquals("I move forward while retaining the rotation", forwardCommand.tellMeHowYouOperate());
    }

    @Test
    public void processCommand() {
        int xCoordinate = robotPosition.getXCoordinate();
        int yCoordinate = robotPosition.getYCoordinate();
        RobotPosition newRobotPosition = forwardCommand.processCommand(robotPosition);
        Assert.assertNotEquals(newRobotPosition.getXCoordinate(),xCoordinate);
    }
}