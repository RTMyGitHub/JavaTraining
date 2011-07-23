--> FIT stands for Framework for Integration Testing which helps communicate between business users, testers and the developers

--> FIT expects the input information being in the HTML tables. Since designing an HTML table by hand can be tedious, draw a table in Micosoft Word and save it as .html file. 
    Word automatically generates the HTML code for you. Keep this .html file in input folder. This table will have few examples of how the code should behave. 

Q : How to run this example?
A : Go to command prompt and go to src folder of FIT projects (for example "cd C:\projects\FIT\src") and then type the following command
    java -classpath ..\lib\fit.jar;..\bin; fit.FileRunner input\payment.html output\results.html