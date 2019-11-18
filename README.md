# MartianRobot

![Alt text](res/Robot-Movement-1stCommand-Example.jpeg?raw=true "Understanding Robot movement ")


### Command to compile the code:
1. Navigate to src directory and then run the javac command to compile the src files

```
javac com/staunch/Main.java
```

2. Run the application using below command 
   for example ("1 1 E RFRFRFRF is used as command")
```
java com/staunch/Main 1 1 E RFRFRFRF
```
3. Once we run the program with command - below result grids are printed step by step 
``` 
1 1 E RFRFRFRF
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