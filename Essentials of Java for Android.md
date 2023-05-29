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

