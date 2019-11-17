package com.staunch.command;

import com.staunch.robot.RobotPosition;
import org.junit.Assert;

import static org.junit.Assert.*;

public class ForwardCommandTest {

    ForwardCommand forwardCommand;
    RobotPosition robotPosition;

    @org.junit.Before
    public void setUp() throws Exception {
        forwardCommand = new ForwardCommand();
        robotPosition = new RobotPosition(0,0,'E');
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void getCommandCharacter() {
        Assert.assertEquals('F', forwardCommand.getCommandCharacter());
    }

    @org.junit.Test
    public void tellMeHowYouOperate() {
        Assert.assertEquals("I move forward while retaining the rotation", forwardCommand.tellMeHowYouOperate());
    }

    @org.junit.Test
    public void processCommand() {
        int xCoordinate = robotPosition.getXCoordinate();
        int yCoordinate = robotPosition.getYCoordinate();
        RobotPosition newRobotPosition = forwardCommand.processCommand(robotPosition);
        Assert.assertNotEquals(newRobotPosition.getXCoordinate(),xCoordinate);
    }
}