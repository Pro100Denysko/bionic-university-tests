# bionic-university-tests
Tasks for Entry Tests (Java ЕE)

1.	Given an array of objects which contains information about one operation of fish sale (name of fish, price of purchase (PP), date of purchase, price of sale(PS), date of sale, sale weight (W)) 

Create an Income Statement grouped by fish names. Income value is calculated as:
   Income = (PS – PP – store_days*const) * W
Here const is some value that contains overheads


2.	An array of the following objects is given:
-	book description (author(s), title, publisher, annotation, text)
-	article (author(s), title, journal name, year, N, text)
-	wiki article (link, title, text)
Find how many objects contains given key words in titles and/or texts


3.	Given an array of following objects:
-	squares (side length)
-	rectangles (width and height)
-	circles (radius)
Find general area of all these figures 

4.	How old are you in days and months? What day of week is your birthday?

5.	Please, explain what the following code do:
public class Calculator { 
		interface IntegerMath { 
			int operation(int a, int b); 
		} 
		public int operateBinary(int a, int b,IntegerMath op) { 
			return op.operation(a, b); 
		}

public static void main(String... args) {  
      			Calculator myApp = new Calculator();  
      			IntegerMath addition = (a, b) -> a + b; 
      			IntegerMath subtraction = (a, b) -> a - b;  
      			System.out.println("40 + 2 = " + myApp.operateBinary(40, 2, addition)); 
      			System.out.println("20 - 10 = " +  myApp.operateBinary(20, 10, subtraction)); 
   		} 
} 
