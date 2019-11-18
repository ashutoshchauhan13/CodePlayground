# MartianRobot

![Alt text](res/Robot-Movement-1stCommand-Example.jpeg?raw=true "Understanding Robot movement ")


#### How to compile and run the code:
1. Navigate to src directory and then run the javac command to compile the src files

```
javac com/staunch/Main.java
```

2. Run the application using below command 
   for example ("1 1 E RFRFRFRF is used as command")
```
java com/staunch/Main 1 1 E RFRFRFRF
```
------
#### Command Examples


Command Instruction 1
====== 
``` 
1 1 E RFRFRFRF
```


##### Martian Robot movement step by step:
 
```
[0,3]	[1,3]	[2,3]	[3,3]	[4,3]	[5,3]	
[0,2]	[1,2]	[2,2]	[3,2]	[4,2]	[5,2]	
[0,1]	[1,1]	[2,1]	[3,1]	[4,1]	[5,1]	
[0,0]	[1,0]	[2,0]	[3,0]	[4,0]	[5,0]	


RFRFRFRF


x: 1 y: 1 orientation: E
<<============================== Starting Robot Position ==============================>>


x: 1 y: 1 orientation: E


[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[1,1:→]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	


<<============================== Command Start ==============================>>
Command given: R	I make clock wise turn
Let's Turn Clockwise

x: 1 y: 1 orientation: S


[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[1,1:↓]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
Command given: F	I move forward while retaining the rotation
Let's Move Forward

x: 1 y: 0 orientation: S


[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[1,0:↓]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
Command given: R	I make clock wise turn
Let's Turn Clockwise

x: 1 y: 0 orientation: W


[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[1,0:←]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
Command given: F	I move forward while retaining the rotation
Let's Move Forward

x: 0 y: 0 orientation: W


[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[0,0:←]	[     ]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
Command given: R	I make clock wise turn
Let's Turn Clockwise

x: 0 y: 0 orientation: N


[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[0,0:↑]	[     ]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
Command given: F	I move forward while retaining the rotation
Let's Move Forward

x: 0 y: 1 orientation: N


[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[0,1:↑]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
Command given: R	I make clock wise turn
Let's Turn Clockwise

x: 0 y: 1 orientation: E


[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[0,1:→]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
Command given: F	I move forward while retaining the rotation
Let's Move Forward

x: 1 y: 1 orientation: E


[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[1,1:→]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
<<============================== Command End ==============================>>

```

##### Result of Instruction 1: x: 1 y: 1 orientation: E

x: 1 y: 1 orientation: E

``` 
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[1,1:→]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]
``` 

Command Instruction 2
======

``` 
3 2 N FRRFLLFFRRFLL
```


##### Martian Robot movement step by step:
``` 
[0,3]	[1,3]	[2,3]	[3,3]	[4,3]	[5,3]	
[0,2]	[1,2]	[2,2]	[3,2]	[4,2]	[5,2]	
[0,1]	[1,1]	[2,1]	[3,1]	[4,1]	[5,1]	
[0,0]	[1,0]	[2,0]	[3,0]	[4,0]	[5,0]	


FRRFLLFFRRFLL


x: 3 y: 2 orientation: N
<<============================== Starting Robot Position ==============================>>


x: 3 y: 2 orientation: N


[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[3,2:↑]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	


<<============================== Command Start ==============================>>
Command given: F	I move forward while retaining the rotation
Let's Move Forward

x: 3 y: 3 orientation: N


[     ]	[     ]	[     ]	[3,3:↑]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
Command given: R	I make clock wise turn
Let's Turn Clockwise

x: 3 y: 3 orientation: E


[     ]	[     ]	[     ]	[3,3:→]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
Command given: R	I make clock wise turn
Let's Turn Clockwise

x: 3 y: 3 orientation: S


[     ]	[     ]	[     ]	[3,3:↓]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
Command given: F	I move forward while retaining the rotation
Let's Move Forward

x: 3 y: 2 orientation: S


[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[3,2:↓]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
Command given: L	I make anti-clock wise turn
Let's Turn Anti-Clockwise

x: 3 y: 2 orientation: E


[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[3,2:→]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
Command given: L	I make anti-clock wise turn
Let's Turn Anti-Clockwise

x: 3 y: 2 orientation: N


[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[3,2:↑]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
Command given: F	I move forward while retaining the rotation
Let's Move Forward

x: 3 y: 3 orientation: N


[     ]	[     ]	[     ]	[3,3:↑]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	
[     ]	[     ]	[     ]	[     ]	[     ]	[     ]	


------------------------------------------------------------
Command given: F	I move forward while retaining the rotation
Let's Move Forward

x: 3 y: 4 orientation: N
Lost positions = [RobotPosition{x: 3, y: 3, o: N}]
Exception in thread "main" java.lang.IllegalStateException: Robot has been LOST
	at com.staunch.Main.checkIfRobotIsStillOnThePlane(Main.java:81)
	at com.staunch.Main.sendCommandsToMartianRobot(Main.java:67)
	at com.staunch.Main.main(Main.java:31)
<<============================== Command End ==============================>>
``` 

##### Result of Instruction 1: x: 3 y: 3 orientation: N
``` 
x: 3 y: 4 orientation: N
Lost positions = [RobotPosition{x: 3, y: 3, o: N}]

Exception in thread "main" java.lang.IllegalStateException: Robot has been LOST
	at com.staunch.Main.checkIfRobotIsStillOnThePlane(Main.java:81)
	at com.staunch.Main.sendCommandsToMartianRobot(Main.java:67)
	at com.staunch.Main.main(Main.java:31)
``` 
##### Video link of the running the application from Mac Terminal

[![IMAGE ALT TEXT HERE](http://img.youtube.com/vi/VnOr7ERMWCI/0.jpg)](http://www.youtube.com/watch?v=VnOr7ERMWCI&feature=youtu.be)