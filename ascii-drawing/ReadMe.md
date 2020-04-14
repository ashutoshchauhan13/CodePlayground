
# Drawing Program - 05 April 2020

### Description

Please implement a simple text (ASCII) based drawing program (something similar to a simplified version of Paint). The basic program
should allow users to:
 1. Create a new canvas
 2. Draw on the canvas using text based commands
 3. Quit the program

### Supported Commands

|commands.Command 		|Description|
|----|----|
|C w h          | Create a new canvas of width w and height h|
|L x1 y1 x2 y2  | Draw a new line from coordinates (x1, y1) to (x2, y2) horizontally or vertically. Lines are made up of the x character|
|R x1 y1 x2 y2  | Draw a new rectangle, with upper left corner at coordinate (x1, y1) and lower right coordinate at (x2, y2). Lines are made up of the x character|
|Q              | Quit the program|

### How To  Run The Program

 
####   Option1 : Using Docker (Easiest Option):
   
   Using docker image is easier way to run the project, you just simply pill the image and run the project
   
   
   Steps:
   
   1. Open the terminal (You can run it in any folder) 
    
   2. First pull the docker image from public repository (ashutoshchauhan13/ascii-drawing-test)
   ```console
    docker pull ashutoshchauhan13/ascii-drawing-test:final
 ```

   3. Run the docker image with below command 
   ```console
    docker run -i ascii-drawing-test:final
 ```
 
 <p align="center">
  <img  src="https://github.com/ashutoshchauhan13/CodePlayground/blob/master/ascii-drawing/screen-shots/docker-image.jpeg?raw=true">
	

</p>


This command will give you interactive 


####   Option 2: Using Bash Script:
   
   I have created a Bash script (which clean, build and then the application), for this step you have to copy/clone the source code.
   
   Steps:
   
   1. Clone/download the repo (https://github.com/ashutoshchauhan13/CodePlayground/tree/development/ascii-drawing) to your local computer
   2. Open the terminal, and navigate to the project folder  
   3. run the runscript
   
   ```console
   bash runscript.sh 
  ```
   
   4. Start executing the commands to the application
   
   
####   Option 3: Using gradle:
   
   Steps:
   1. Open the terminal, and navigate to the project folder  
   2. You can run the gradle clean and build command
   
   ```console
   gradle clean
   gradle build
   ```
   
   3. run the app
   
      ```console
        java -jar build/libs/ascii-drawing-1.0.jar
      ```
   4. Start executing the commands to the application
      
   
####   Option 4: Using the IDE (IntelliJ)
   
   Steps:
   1. Open the project source into IntelliJ/Ecllipse  
   2. Build the App (gradle should automatically build it)
   3. Go to Main.java file and then right click and select "Run the Main.java"
   4. Execute the commands in IDE's terminal window
   

### Unit Tests

1. I have used junit and mockito for testing the app
2. test is located in test dir (ascii-drawing/src/test/)
3. CommandProcessorTest tests the CommandFactory.java 



#### Sample Tests

_Test Case 1:_ Valid Commands 

a. C 20 5

b. L 1 3 7 3

c. L 7 1 7 3

d. R 15 2 20 5

e. Q

Output:

  <p align="center">
  <img  src="https://github.com/ashutoshchauhan13/CodePlayground/blob/master/ascii-drawing/screen-shots/valid-commands.jpg?raw=true">
	

</p>


_Test Case 2:_ Invalid Commands 

a. C 

b. C 20 5

c. L 10 7 10 3

d. Q

Output:

  <p align="center">
  <img  src="https://github.com/ashutoshchauhan13/CodePlayground/blob/master/ascii-drawing/screen-shots/inavlid-commands.jpg?raw=true">



Please do let me know if any issues - ashutoshchauhan13@gmail.com. Thank you
 
