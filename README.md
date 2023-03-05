Create a class according to your variant from the list below.
Using the Lombok library, implement set and get methods, constructors with arguments, a default constructor, and a overridden toString() method.
The created class must contain a public static method getInstance() and a static field "instance", the value of which will be returned by the getInstance method.
In the class, you should also write a main method, in which you need to create an array of class objects using:

	a default constructor
	a constructor that receives all parameters
	2 objects obtained by calling the getInstance() method
Output the identifiers of all objects in the array to the console using a loop with a precondition.

Variant 9.

Create a class Laptop, which will have the following fields:
model: laptop model, default value "Unknown";
screenSize: laptop screen size in inches, default value 15.6;
ram: amount of RAM in GB, default value 8;
storage: amount of storage memory in GB, default value 256;
batteryLife: battery life in hours, default value 5.

The Laptop class should have the following public methods:
addRam(int value): a method that increases the amount of RAM by a specified number;
addStorage(int value): a method that increases the amount of disk space by a specified number;
charge(): a method that sets the maximum charge level.

//also added method print(); (for output our object) and field batteryChargeInPercent for method charge();