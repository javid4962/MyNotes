# Java How to start learning java

Java is one of the most popular and widely used programming languages and platforms. A platform is an environment that helps to develop and run programs written in any programming language.

Java is fast, reliable, and secure. From desktop to web applications, scientific supercomputers to gaming consoles, cell phones to the Internet, Java is used in every nook and corner.

## About Java

Java is a simple language: Java is easy to learn and its syntax is clear and concise. It is based on C++ (so it is easier for programmers who know C++). Java has removed many confusing and rarely-used features e.g. explicit pointers, operator overloading, etc. Java also takes care of memory management and it also provides an automatic garbage collector. This collects the unused objects automatically.

Java is a platform-independent language: The programs written in Java language, after compilation, are converted into an intermediate level language called the bytecode which is a part of the Java platform irrespective of the machine on which the programs run. This makes java highly portable as its bytecodes can be run on any machine by an interpreter called the Java Virtual Machine(JVM) and thus java provides 'reusability of code'.

Java is an object-oriented programming language: OOP makes the complete program simpler by dividing it into a number of objects. The objects can be used as a bridge to have data flow from one function to another. We can easily modify data and function's as per the requirements of the program.

Java is a robust language: Java programs must be reliable because they are used in both consumer and mission-critical applications, ranging from Blu-ray players to navigation systems.

Java is a multithreaded language: Java can perform many tasks at once by defining multiple threads. For example, a program that manages a Graphical User Interface (GUI) while waiting for input from a network connection uses another thread to perform and wait's instead of using the default GUI thread for both tasks. This keeps the GUI responsive.

Java programs can create applets: Applets are programs that run in web browsers. But applets support was deprecated in Java 9 release and has been removed in Java 11 release due to waning browser support for the Java plugin.

Java does not require any preprocessor: It does not require inclusion of header files for creating a Java application.

1) Understand the basics: Learning the basics of any programming language is very important. It is the best way to begin learning something new. Don't have any anxiety, begin learning the concepts about the language. Get familiar with the environment, and slowly you will get used to it within no time. Here are a few links to get you started:
        Java - Overview
        Java - Basics(Articles)
        Java - Basics (Videos)
        OOP - Concept

2) Patience is the key: Learning Java will be overwhelming because of the volume of material about the language but be patient, learn at your own pace, don't rush. Mastering Java is a process that takes time. And remember even the best coders would have started at some point. So it's not a big deal, just do as much as you can and keep going. Give it your time.Patience is the key to success.

3) Practice Coding Once you have understood the basics, the best thing to do is to brush up your skills with regular practice. True knowledge comes only when you implement what you've learned, as is said 'Practice Makes a Man Perfect'. So, code more than you read. This will build your confidence. Remember Perfect Practice makes you Perfect. Practice Coding: You can increase your coding skills here. Happy Coding!
    
4) Read about Java regularly Continuously read about the various topics in Java and try to explore more. This will help to maintain your interest in Java. Go through this link to explore the vast world of Java

5) Study in a group Group study is a better way to learn something. This way you get to know about new things about the topic as everyone presents their ideas and you can discuss and solve your coding problems on the spot. Get to know a common group of people who are willing to learn java. Get help from a tutor and read as many books about java as possible. There are many good books in the market that will help you in learning java.

# Java Hello World Program

The process of Java programming can be simplified in three steps: 

-> Create the program by typing it into a text editor and saving it to a file - HelloWorld.java.

-> Compile it by typing "javac HelloWorld.java" in the terminal window.

-> Execute (or run) it by typing "java HelloWorld" in the terminal window.

```
// This is a simple Java program.
// FileName : "HelloWorld.java".

class HelloWorld
{
    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static void main(String args[])
    {
        System.out.println("Hello, World");
    }
}
```

output: ```Hello, World```

The "Hello World!" program consists of three primary components: the HelloWorld class definition, the main method, and source code comments.

-> In java programming language, every program must contain a main method. The main function(method) is the entry point of application, and it's mandatory in java program. 

```public static void main(String[] args)```

public: So that JVM can execute the method from anywhere.

static: The main method is to be called without an object. The modifiers public and static can be written in either order.

void: The main method doesn't return anything.

main(): Name configured in the JVM. The main method must be inside the class definition. The compiler executes the codes starting always from the main function.

String[]: The main method accepts a single argument, i.e., an array of elements of type String.

```System.out.println("Hello, World");```

This line output the string "Hello, World" followed by a new line. 
`System` - predefined class
`out` - is the variable of type output stream connected to the console
`println()` - built-in method.

### important points

The name of the class defined by the program is HelloWorld, which is the same as the name of the file(HelloWorld.java). This is not a coincidence. In Java, all codes must reside inside a class, and there is at most one public class which contains the main() method.

By convention, the name of the main class(a class that contains the main method) should match the name of the file that holds the program.

Every Java program must have a class definition that matches the filename (class name and file name should be same).

Compiling the program - `javac HelloWorld.java` -> Creates a HelloWorld.class file contains bytecode version of the program.

Executing the program - `java HelloWorld` -> prints "Hello, World" to the terminal screen.

# JVM Shutdown Hook in Java

Shutdown Hooks are a special construct that allows developers to plug in a piece of code to be executed when the JVM is shutting down. This comes in handy in cases where we need to do special clean up operations in case the VM is shutting down.

Example 1

java```  
public class ShutDownHook
{
  public static void main(String[] args)
  {

    Runtime.getRuntime().addShutdownHook(new Thread()
    {
      public void run()
      {
        System.out.println("Shutdown Hook is running !");
      }
    });
    System.out.println("Application Terminating ...");
  }
}
```

output : ```
Application Terminating ...
Shutdown Hook is running !
```

Example 2

```class ThreadChild extends Thread {
    
    public void run() {
        
        System.out.println("In clean up code");
        System.out.println("In shutdown hook");
    }
}

class Demo {
    
    public static void main(String[] args) {
        
        Runtime current = Runtime.getRuntime();
        current.addShutdownHook(new ThreadChild());

        for(int i = 1; i <= 10; i++) 
            System.out.println("2 X " + i + " = " + 2 * i);
    }
}
```

output : ```
            2 X 1 = 2
            
            2 X 2 = 4

            2 X 3 = 6

            2 X 4 = 8

            2 X 5 = 10

            2 X 6 = 12

            2 X 7 = 14

            2 X 8 = 16

            2 X 9 = 18

            2 X 10 = 20

            In clean up code

            In shutdown hook
            
          ```
# Java Class File

A Java Class File is a file that containing the byte code and having .class extension that can be executed by JVM.
Java Class file is created by a java compiler form .java files as a result of successful compilation.

![Alt text](image.png)
![Alt text](image-1.png)

# Difference between JDK, JRE and JVM

Java Development Kit (JDK) is a software development environment used for developing java applications and applets.
It includes Java Runtime Environment (JRE), an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), and other tools needed in Java development. 
The Java Runtime Environment provides the minimum requirements for executing a Java application; it consists of the Java Virtual Machine (JVM), core classes, and supporting files. 

Now let us discuss JVM, which stands out for java virtual machine. It is as follows:

-> A specification where the working of Java Virtual Machine is specified. But implementation provider is independent to choose the algorithm. Its implementation has been provided by Sun and other companies.
-> An implementation is a computer program that meets the requirements of the JVM specification.
-> Runtime Instance Whenever you write a java command on the command prompt to run the java class, an instance of JVM is created.

![Alt text](JDK.png)

1. JDK (Java Development Kit) is a Kit that provides the environment to develop and execute(run) the Java program. JDK is a kit(or package) that includes two things

-> Development Tools(to provide an environment to develop your java programs)
-> JRE (to execute your java program).
     
2. JRE (Java Runtime Environment) is an installation package that provides an environment to only run(not develop) the java program(or application)onto your machine. JRE is only used by those who only want to run Java programs that are end-users of your system.

3. JVM (Java Virtual Machine) is a very important part of both JDK and JRE because it is contained or inbuilt in both. Whatever Java program you run using JRE or JDK goes into JVM and JVM is responsible for executing the java program line by line, hence it is also known as an interpreter.

<hr>
<hr>

# What is Programming ? 

> Programming is an art of talking to acomputer.

# Data Types

<table border=1>
  <tr>
    <th>Real World Data</th>
    <th>Java Data Types</th>
  </tr>
  <tr>
    <td>Integer</td>
    <td>byte, short, int, long</td>
  </tr>
  <tr>
    <td>Real/Fractional</td>
    <td>float, double</td>
  </tr>
  <tr>
    <td>Character</td>
    <td>char</td>
  </tr>
  <tr>
    <td>Yes-No</td>
    <td>boolean</td>
  </tr>
  <tr>
    <td>Multimedia</td>
    <td>Non Premitive Data Types</td>
  </tr>
</table>

# Data Types - Sizes and Range

<table>
  <tr>
    <th>Data Type</th>
    <th>Size</th>
    <th>Range</th>
  </tr>
  
  <tr>
    <td>byte</td>
    <td>1 byte</td>
    <td>-128 to 127</td>
  </tr>
  <tr>
    <td>short</td>
    <td>2 bytes</td>
    <td>-32768 to 32767</td>
  </tr>
  <tr>
    <td>int</td>
    <td>4 bytes</td>
    <td>-2147483648 to 2147483647</td>
  </tr>
  <tr>
    <td>long</td>
    <td>8 bytes</td>
    <td>-9223372036854775808 to 9223372036854775807</td>
  </tr>
  </table>


# Object-Oriented Programming
- Object Oriented programming (OOP) is a approach of programming which is used to solve the real-world problems.
- Objects are programming representation of real-world entities.
- All the instructions which are required to create an object in java, must be kept inside a class.

## Example 
- To create an object we require the following information.
- 1) State of Object or Property of Object
- 2) Behaviour of Object or Actions of Objects.

 for Example:-
- For the Student Object 
  - State of Student : name, roll_no, marks, skills.
  - Behaviour of Student : studying, playing, sleeping, eating.
- For the Car Object
  - State of Car : brand, color, price.
  - Behaviour of Car : accelerates.
  - 
![alt text](image-2.png)

```java 
class Car {
    String brand;
    String color;
    int price;
    
    void accelerate(){
        System.out.println(brand+" Car accelarates");
    }
}

class CarApp{
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "maruthi";
        c.color = "cyan";
        c.price = 120000;

        System.out.println("Brand : "+c.brand);;
        System.out.println("Color : "+c.color);
        System.out.println("Price : "+c.price);
        c.accelerate();
    }
}
```
```output 
Brand : maruthi
Color : cyan
Price : 120000
maruthi Car accelarates
```
![alt text](image-4.png)


# Constructor

## Program without Constructor
```java
class Teacher{
  String name;
  String sub;
  int sal;

  void teach(){
    System.out.println("A teacher teaches");
  }
}
class TeacherApp{
  public static void main(String[] args){
    Teacher t1 = new Teacher();
    t1.name = "Deep";
    t1.sub = "java";
    t1.sal = 25000;

    Teacher t2 = new Teacher();
    t2.name = "kushal";
    t2.sub = "Aptitude";
    t2.sal = 30000;
  }
}
```
 ## Constructor in Java
 - > Java provide us much more efficient way for giving the values for our instance variables which are present inside the object and that is called as constructor.
 - > Name of the constructor is always same as the name of the class.
 - > Whatever variable Teacher Constructor is accepting are known as local variable.
 - > When is constructor going to get called - During the object creation.
 - > What is the use of a constructor - We can use a constructor to give or set the values for our instance variable.
  
## Program with Constructor
```java
class Teacher{
  String name;
  String sub;
  int sal;

  void teach(){
    System.out.println("A teacher teaches");
  }
  Teacher(String name, String sub, int sal){ // Local Variables
    this.name = name; // Instance Variables
    this.sub = sub;
    this.sal = sal;
  }
}
class TeacherApp{
  public static void main(String[] args){
    Teacher t1 = new Teacher("Deep","Java",25000);
    Teacher t2 = new Teacher("Kushal","Aptitude",30000);
  }
}
```
![alt text](image-5.png)

# Arrays
- > We have understood that to store the information of data, we need to create variables.
- > But, storing data in variables is not efficient when it comes to large volume of data.
- > For example :
  - > To store the marks of certain people we were using the following approach-
    - int arun_marks = 65;
    - int alia_marks = 75;
    - int mahesh_marks = 85;
    - int rahul_marks = 95;
  - > In above scenario we have stored only 4 people marks, But you know in reality we have several names of students. So, storing in variables is not efficient approach.
- > To store large volume of data efficiently we have to make use of `Arrays`.

## 1-D Array Example Without Loop
- As in java arrays are objects. To create an array we need to use new keyword, as shown below
  
```java
class Result{
  public static void main(String[] args){
    int marks[] = new int[5];
    marks[0] = 55;
    marks[1] = 65;
    marks[2] = 75;
    marks[3] = 85;
    marks[4] = 95;
    System.out.println("Marks of Students : ");
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    System.out.println(marks[3]);
    System.out.println(marks[4]);
  }
}
```
```output
Marks of students : 
55
65
75
85
95
```
## 1-D Array Example With using Loop and taking input from the user
```java
import java.util.Scanner;
class Result{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of the array: ");
    int n = sc.nextInt();
    int marks[] = new int[n];
    // Storing marks of the student
    System.out.println("Enter marks of the Students: ");
    for(int i = 0; i < marks.length; i++){
      marks[i] = sc.nextInt();
    }
    // Printing marks of the student
    System.out.println("Marks of students: ");
    for(int i = 0; i < marks.length; i++){
      System.out.println(marks[i]);
    }
  }
}
```
## Eclipse Installation and First Program
> IDE: Stands for "Integrated Development Environment".
> Note: Eclipse is going to follow a hierarchy.

## Steps to create First Java Program
- goto "File" option in Menubar.
- goto new -> look for "Java Project" (or)
  - look for "other" option and select "Java Project", provide a valid "project-name".
  - hit "finish".
  - project has been created.
- Expand the Project
  - goto "src" folder
  - right click on "src" folder
  - goto "package"
  - provide a valid name ofr package 
  - hit "finish"
- Right click on the package
  - goto "new" option
  - select "class" option
  - provide a valid "class name"
  - hit "finish".
- Complete the program as shaown below
  ```java
    package practice;

    public class Greet{
      public static void main(String[] args){
        System.out.println("Hello World!");
      }
    }
  ```
- In order to run the program,
  - 1) click on "green button", select "Java Application", hit "ok" (or)
  - 2) Right click anywhere in your program click on Run As
  - select "Java Application" and click it.

## 2-D Arrays
```java
  String name[][] = new String[2][3];
  name[0][0] = "Raj";
  name[0][1] = "Aalia";
  name[0][2] = "Raju";
  name[1][0] = "Anu";
  name[1][1] = "Sonu";
  name[1][2] = "Varun";
```
![alt text](image-6.png)
> name.length = 2
> name[0].length = 3
> name[1].length = 3

## 2-D Array Example
> Note: If you are taking String input after taking number input you must us an extra nextLine().
```java
  import java.util.Scanner;

  public class NamesApp{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter number of classes");
      int row = sc.nextInt();
      System.out.println("Please enter number of students in each class");
      int col = sc.nextInt();
      sc.nextLine();
      String names[][] = new String[row][col];
      // Storing names in array
      System.out.println("Please enter names : ");
      for(int i = 0; i < names.length; i++){
        for(int j = 0; j < names[i].length; j++){
          names[i][j] = sc.nextLine();
        }
      }
      // Printing names in the array
      System.out.println("Names of Students : ");
      for(int i = 0; i < names.length; i++){
        for(int j = 0; j < names[i].length; j++){
          System.out.println(names[i][j]+" ");
        }
        System.out.println();
      }
    }
  }
```
```output
Please enter number of classes
2
Please enter number of students in each class
3
Please enter names : 
ravi
sanju
ramya
allu
mahesh
tarun
Names of Student : 
ravi  sanju   ramya
allu  mahesh  tarun