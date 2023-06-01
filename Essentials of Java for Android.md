# Essentials of Java For Android Development
Java is an ***Object Oriented Programming Language*** .

***Pre-requisites***
- You need to have basic understanding of any one programming language
- You just need internet and a nice browser. 

***Hello World! Program***
```java
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
```

***Output***
```
Hello world
```

***Data types in Java***     
- Primitive
- Non Primitive

***Primitive Data Types***
- boolean - 1 bit
- byte - 1 Byte - 8 bits
- char - 2 Bytes - 16 bits
- short - 2 Bytes - 16 bits
- int - 4 Bytes - 32 bits
- long - 8 Bytes - 64 bits
- float - 4 Bytes - 32 bits
- double - 8 Bytes - 64 bits

***Example***

```java

public class Main
{
	public static void main(String[] args) {
		int x = 10;
		long y = 1234546789L;
		System.out.println(x+"  "+y);
	}
}

```

***output***
```
10  1234546789
```

***Addition of Two numbers***
```java
public class Main
{
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println(x+y);
	}
}
```

***Arithmetic operators in java***
- \+ (Addition)
- \- (Subtraction)
- \* (Multiplication)
- / (division)
- % (modular division)
- = (assignment)

***Read Values from the user***
- BufferedReader
- Scanner

***Example Using a BufferedReader***
```Java

import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		int x,y;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your number");
		x = Integer.parseInt(br.readLine());
		System.out.println("Enter your number");
		y = Integer.parseInt(br.readLine());
		System.out.println(x+y);
	}
}
```

***Example Using Scanner***
```java
import java.util.Scanner;

public class Main{
    
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = s.nextInt();
        System.out.println("Enter the number");
        int y = s.nextInt();
        System.out.println(x+y);
    }
}
```

***Control Statements in Java***
- Three types of Control Statements
	- Decision Making Statements
		- if statements
		- switch statements
	- Loop Statements
		- for
		- while
		- do-while
		- for-each
	- Jump Statements
		- break
		- continue
		
***Relational Operators in Java***
- Greater than (>)
- Less than (<)
- Equal to (==)
- Not Equal to (!=)
- Greater than or equal to (>=)
- less than or equal to (<=)

***Logical Operators***
- AND (&&)
- OR (||)
- Not (!)

***Prime Number Program***
```java
import java.util.Scanner;

public class Main{
    
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Lower bound");
        int x = s.nextInt();
        System.out.println("Enter the Upper bound");
        int y = s.nextInt();
        
        int count = 0;
        while(y>=x){
            if(isPrime(x)){
                System.out.print(x+" ");
                count++;
            }
            x++;
        }
        
        System.out.println("\nThere are "+count+" Number of Prime numbers found in the given Range");
    }
    
    public static boolean isPrime(int n){
        int i = 2;
        while(n>i){
            if(n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
```

```
Assignment: A certain grade of steel has to be graded according to the following conditions
A. The steel's carbon content must be less than 0.7
B. The steel's tensile strength must be greater than 5600
C. The steel's hardness must be less than 50

1. if all the conditions are met, the grade is 10
2. if only A & B are true, the grade is 9
3. if only B & C are true, the grade is 8
4. if only A & C are true, the grade is 7
5. if only one of the A,B,C conditions are true, the grade is 6
6. if none of the conditions are met, the grade is 5.

Ask the user to enter the carbon content, tensile strength and hardness and based on his/her
inputs decide the grade of the steel.
```

***Switch***
If there are multiple values you would like to check for 
we use switch

```java

public class Main
{
	public static void main(String[] args) {
		printCase(1);
		printCase(5);
	}
	
	public static void printCase(int n){
	    switch(n){
	        case 0: 
	            System.out.println(2*2+" the case 0 is executed");
	            break;
	        case 1:
	            System.out.println("the case 1 is executed");
	            break;
	        case 2:
	            System.out.println("Case 2 is executed");
	            break;
	        default:
	            System.out.println("Wrong value entered");
	            break;
	               
	    }
	}
}
```

***while***

**syntax of while**
```java
while(condition){
	// statements
}
```

***Example***
```java
public class Main
{
	public static void main(String[] args) {
		int i=1; //loop counter
		while(i <= 100)
		{
		    if(i%2 == 0){
		        System.out.print(i+" ");     
		    }
		    i++; // i = i+1;, i+=1;
		}
		
	}
}
```

***Example 2***
```java
public class Main
{
	public static void main(String[] args) {
		int i=100; //loop counter
		while(i >= 1)
		{
		    if(i%2 == 0){
		        System.out.print(i+" ");     
		    }
		    i--; // i = i-1;, i-=1;
		}
		
	}
}
```

***output***
```
100 98 96 94 92 90 88 86 84 82 80 78 76 74 72 70 68 66 64 62 60 58 56 54 52 50 48 46 44 42 40 38 36 34 32 30 28 26 24 22 20 18 16 14 12 10 8 6 4 2
```

***do-while***
Do while works the same is while with a small difference
- If the condition is not met in while loop in the first 
iteration itself, the statements inside the while loop
will never execute.
- If the condition is not met in do-while loop for the first time
the statements will execute atleast once. 

***syntax***
```java
do{
//statements
} while(condition);
```

***Example***
```java

public class Main
{
	public static void main(String[] args) {
		int i=100; //loop counter
		do{
		    System.out.println(i);
		    i++;
		}while(i<100);
		
	/*	while(i<100){
		    System.out.println(i);
		    i++;
		}*/
		
	}
}

```

***Output***
```
100
```

***for loop***
***syntax***
```java
for(initialization; condition; increment/decrement)
{
	// statements
}
```
***Example***
```java

public class Main
{
	public static void main(String[] args) {
		for(int i=3; i<=100; i+=2){
		    System.out.print(i+" ");
		}
	}
}
```

***output***
```
3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99
```

***Assignment***
```Write a program that prints all the `Special numbers` between 1 and 1000. a special number is any number when the individual digits are summed up, the resultatnt would be the factor of the current number```


***Java Arrays***
- An array is a collection of similar type of data items under one single name
- The array elements are stored in contegious memory locations (side by side)
- these locations can be accessed by the indices.
- Array index starts at 0 and ends at 1 less than the actual size

***Example***
```java

public class Main
{
	public static void main(String[] args) {
	    int a[] = new int[]{10,20,30,40,50,60,70,80,90,100};
	    
	    // Access individual items
	    System.out.println(a[7]);
	    
	    // modify the existing value
	    a[4] = 150;
	    System.out.println(a[4]);
	    
	    // get all the values in the array
	    for(int i=0; i<a.length; i++){
	        System.out.print(a[i]+" ");
	    }
	}
}

```

***output***
```
80
150
10 20 30 40 150 60 70 80 90 100 
```

***Example - Array values entered by the user***
```java
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    System.out.println("Enter the size of the array");
	    Scanner s = new Scanner(System.in);
	    int l = s.nextInt();
	    int a[] = new int[l];
	    int sum = 0;
	    for(int i=0; i<l; i++){
	        System.out.println("Enter a value");
	        a[i] = s.nextInt();
	        sum += a[i]; // sum = sum + a[i]
	    }
	    
	    System.out.println(sum);
	}
}

```
***output***
```
Enter the size of the array
5
Enter a value
10
Enter a value
20
Enter a value
30
Enter a value
40
Enter a value
50
150
```

***Assignment***
A teacher wants to know the average marks of her students in a certain test
Write a program where she can enter all her students marks and expect the average
marks obtained by the class on a whole

***for-each loop Syntax***
```java
	for(int b: collection_variable_value(that has integers)){
		// statements
	}
```

***Example***
```java
public class Main
{
	public static void main(String[] args) {
        int a[] = new int[]{10,20,30,40,50,60,70};
        
        /*for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }*/
        
        for(int b : a){
            System.out.print(b+" ");
        }
	}
}
```
***Output***
```
10 20 30 40 50 60 70
```

***JUMP Statements in Java***
- break -> breaks a loop
- continue -> skips the following statements and takes the control to the next iteration
- Usually these statements are associated with an if(...)
***Example - Break***
```java
public class Main
{
	public static void main(String[] args) {
        /*Print all the numbers between 1 and 100 till the number is exactly divisible by 39*/
        for(int i=1; i<=100; i++){
            if(i%39 == 0){
                break;
            }
            System.out.print(i+" ");
        }
        
	}
}

```
***output***
```
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38
```

***Example - Continue***
```java
public class Main
{
	public static void main(String[] args) {
        /*print all the numbers between 1 and 100 that are not divisible by 3*/
        for(int i=1; i<=100; i++){
            if(i%3 == 0){
                continue;
            }
            System.out.print(i+" ");
        }
	}
}
```

***Output***
```
1 2 4 5 7 8 10 11 13 14 16 17 19 20 22 23 25 26 28 29 31 32 34 35 37 38 40 41 43 44 46 47 49 50 52 53 55 56 58 59 61 62 64 65 67 68 70 71 73 74 76 77 79 80 82 83 85 86 88 89 91 92 94 95 97 98 100 
```

***Java Oops***
- OOPs -> Object oriented programming system
- Java is a purely oop language
- You cannot write any program without declaring a class.
- Everything in java is built around objects

***Important Concepts***
- Objects
- Classes
- Inheritance
- Polymorphism
- Abstraction & Interfaces
- Encapsulation
- Collections

***Objects***
- Any Real world entity can be considered as an object if it exhibits attributes and behaviors
- An Object is just the copy of a class (instance)

***Class***
- A class is a blueprint (template) of an Object (that you want to represent in your program)
- Variables (instance variables) in the class they are allotted with memory when an object is created
- Always keep the first letter of your class in Capital letter. This is not a rule, 
this is just an adjustment that all developers agreed to follow. 

***Syntax of declaring a class***
```java
	class Dog{
		// Attributes -> Variables
		// Behaviors -> Methods (functions)
	}
```

***Example***
```java

class Dog{
    String name;
    int age;
    double weight;
    
    // behaviors
    public void barkAtStrangers(){
        System.out.println("Bow!Bow! "+name);
    }
    
    public void swim(){
        System.out.println("I can Swim "+age);
    }
}

public class Main
{
	public static void main(String[] args) {
       Dog d1 = new Dog();
       d1.name = "Tommy";
       d1.age = 14;
       d1.weight = 8.98;
       d1.barkAtStrangers();
       
       Dog d2 = new Dog();
       d2.name = "Jimmy";
       d2.age = 15;
       d2.weight = 9.78;
       d2.barkAtStrangers();
       d2.swim();
       d1.swim();
       
       Dog d3 = d1;
       d3.swim();
	}
}
```

***output***
```
Bow!Bow! Jimmy
I can Swim 15
I can Swim 14
I can Swim 14
```

***Constructors in java***
* At the time of initializing an object, if you want to intialize a few variables of that object, we can use a constructor
* There is a default constructor available for every class you create.
* In Java, We can have ,multiple constructors for the same class (This is called constructor Overloading)
* Types of Constructors
	* Default Constructor (No arguments)
	* Parameterized constructor (Arguments)
* Constructors look like methods but does not have return type.
* The name of the constructor should be the same as that of the class name
***Example - Parameterized Constructor in Java***

```java
class Dog{
    String name;
    int age;
    double weight;
    // Even if you do not write this, it is there
    // However, if you define a parameterized constructor, we will not get this by default.
    Dog(){
        // this is the default constructor -no arguments
    }
    Dog(String n, int a, double w){
        name = n;
        age = a;
        weight = w;
    }
    
    // behaviors
    public void barkAtStrangers(){
        System.out.println("Bow!Bow! "+name);
    }
    
    public void swim(){
        System.out.println("I can Swim "+age);
    }
}

public class Main
{
	public static void main(String[] args) {
		 Dog d1 = new Dog("Tommy",14,8.98);
         d1.barkAtStrangers();
       
       Dog d2 = new Dog();
       d2.name = "Jimmy";
       d2.age = 15;
       d2.weight = 9.78;
       d2.barkAtStrangers();
       d2.swim();
       d1.swim();
	}
}

```
***Output***
```
Bow!Bow! Tommy
Bow!Bow! Jimmy
I can Swim 15
I can Swim 14
```

***Inheritance in java***
* It is a mechanism in which one class aquires the attributes and behaviors of another class
* The class that acquires the properties of another class is called as the "Derived class" or "Sub Class" or "child Class".
* The one that lets another class aquire its properties is called as "Base class" or "Parent Class" or "Super class".

***Types of Inheritance***
![Picture](/picture1.png)

* Single 
* Multi Level
* Hierarchical
* Multiple (this is not supported)

***Example - Single inheritance***
```java
import java.lang.Math;

class Parent{
    int a;
    
    public int square(){
        return a*a;
    }
}

// extends keyword must be used to aquire the properties of the super class
class Child extends Parent{
    double d;
    
    public double squareRoot(){
        return Math.sqrt(d);
    }
}

class Main{
    public static void main (String[] args) {
        Child c = new Child();
        c.a = 10;
        int x = c.square();
        System.out.println(x);
        
        c.d = 9;
        double y = c.squareRoot();
        System.out.println(y);
    }
}
```

**Output**
```
100
3.0
```

***Example - Multi Level inheritance***
```java
import java.lang.Math;

class Parent{
    int a;
    
    public int square(){
        return a*a;
    }
}

// extends keyword must be used to aquire the properties of the super class
class Child extends Parent{
    double d;
    
    public double squareRoot(){
        return Math.sqrt(d);
    }
}

class GrandChild extends Child{
    double x,y;
    public double num2Power(){
        return Math.pow(x,y);
    }
}

class Main{
    public static void main (String[] args) {
        GrandChild c = new GrandChild();
        c.a = 10;
        int x = c.square();
        System.out.println(x);
        
        c.d = 9;
        double y = c.squareRoot();
        System.out.println(y);
        
        c.x = 2;
        c.y = 4;
        double z = c.num2Power();
        
        System.out.println(z);
    }
}
```

***Output***
```
100
3.0
16.0
```

***Example - Hierarchical Inheritance***
```java
class Animal{
    public void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("BOW BOW!!");
    }
}

class Cat extends Animal{
    public void shout(){
        System.out.println("MEOW MEOW!!");
    }
}

class Main{
    public static void main (String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        
        c.eat();  c.shout();
        d.eat();  d.bark();
    }
}
```

***output***
```
Eating...
MEOW MEOW!!
Eating...
BOW BOW!!
```

***Polymorphism in Java***
- Means Existing in multiple forms
- Two polymorphisms
	- Run time Polymorphism (method overriding)
	- Compile Time Polymorphism (method overloading)
* Compile Time Polymorphism
	- if a class has multiple methods of the same name but different number/ different types of parameters, then it is known as compile time polymorphism

***Example - Compile time Polymorphism***
```java
public class Main
{
	public static void main(String[] args) {
		SumOfNumbers s = new SumOfNumbers();
		s.sum(10,20);
		s.sum(10,20,30);
		s.sum(10.4,4.56);
	}
}

class SumOfNumbers{
    public void sum(int a, int b){
        System.out.println(a+b);
    }
    
    public void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    
    public void sum(double a, double b){
        System.out.println(a+b);
    }
}
```
***Output***
```
30
60
14.96
```

- Run time Polymorphism (Method overriding)
	- Inorder to implement method overriding, we need the inheritance implemented
	- Method overriding means that creating the same method in the child class which is already present in the parent class to redefine how the method works. 

***Example - Method Overriding***
```java
class Summing{
    public void sum(int a, int b){
        System.out.println(a+b);
    }
}

class SumOfNumbers extends Summing{
    
    @Override
    public void sum(int a, int b){
        System.out.println("Counting...");
        System.out.println(a+b);
    }
}

class Main{
    public static void main (String[] args) {
        SumOfNumbers s = new SumOfNumbers();
        s.sum(10,20);
    }
    
}

```

***Output***
```
Counting...
30
```

***Super Keyword in java***
- **super** keyword in java is used to refer to the immediate super class object
- If you create an object for a class B that extends to class A, implicitly there will be an object created for class A. to refer to this implicitly created object, we use **super** keyword.
***Example - Accessing immediate parent class's variable***
```java
class A{
    int count = 0;
}

class B extends A{
    int count = 0;
    public void display(){
        super.count += 10; //super.count = super.count + 10;
        System.out.println(super.count);
        System.out.println(count);
    }
}

class Main{
    public static void main (String[] args) {
        B b = new B();
        b.count = b.count + 1;
        b.display();
    }
}
```

***output***
```
10
1
```

***Example - Accessing the immediate parent class's method using super keyword***
```java
class A{
    int count = 0;
    public void display(){
        System.out.println("Pavan");
    }
}

class B extends A{
    int count = 0;
    
    
    public void printme(){
        super.count += 10; //super.count = super.count + 10;
        System.out.println(super.count);
        System.out.println(count);
        super.display();
    }
}

class Main{
    public static void main (String[] args) {
        B b = new B();
        b.count = b.count + 1;
        b.printme();
    }
}
```

***Output***
```
10
1
Pavan
```

***Example - Super keyword to access the immediate parent class's constructor***
```java
class A{
    int count = 0;
    A(int c){
        count = c;
        System.out.println("Super class constructor is called!!");
    }
    public void display(){
        System.out.println("Pavan");
    }
}

class B extends A{
    int count = 0;
    B(){ 
        // constructor of the super class can be called with in a constructor and
        // that too the statement `super(...)` should be first line in the constructor
        super(123);
        System.out.println("We are in subclass now");
    }
    
    public void printme(){
        super.count += 10; //super.count = super.count + 10;
        System.out.println(super.count);
        System.out.println(count);
        super.display();
    }
}

class Main{
    public static void main (String[] args) {
        B b = new B();
        b.count = b.count + 1;
        b.printme();
    }
}
```

***output***
```
Super class constructor is called!!
We are in subclass now
133
1
Pavan
```

***Two Types Variables***
- ***class Variables*** - they belong to the class and is shared commonly by all the objects that are created for that class
- ***Instance Variables*** - They belong to the object (instance)

***Static keyword***
- It is used for better memory management
- static keyword can also be applied for methods, blocks and nested classes
- Java Static variables
	- Variables that are defined with static keyword
	- if you have a common property that needs to be applied for all the objects that you create for that class. then, to manage the memory well, you can use static variable.
	- AS the static variable belongs to the class, we can access it without creating an object

***Example - Using static keyword to create a class variable***
```java
class A{
    // the aim is to claculate the number of objects created for this class
    static int count = 0;
    A(){
        count++;
    }
    
    public void display(){
        System.out.println("there are "+count+" Objects created for this class");
    }
}

class Main{
    public static void main (String[] args) {
        A a = new A();
        a.display();
        A b = new A();
        A c = new A();
        A d = new A();
        A e = new A();
        A f = new A();
        System.out.println(A.count);
    }
}
```
***output***
```
there are 1 Objects created for this class
6
```

