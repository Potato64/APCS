/*
Name: Ethan Duer
Project Name: 13-3 Self Check
Filename: 
_8_14.java
Bay.java
Lake.java
Ocean.java
Pond.java
Purpose: To test knowledge of polymorphism.
Pseudocode: Create a hierarchy of classes with inherited methods,  and have each class
override some of them. Create objects using a few of them, and call some of their methods.
Maintenance log:
2/22/18: Classes created, methods tested
Initially thought var1's method1 would print Bay 1 Pond 2, was correct
Same when var1 was cast to Bay
Thought var2 calls would cause compiler error because reference is object, was wrong
var2 method2 prints Ocean 2, method3 prints Lake 3 Ocean 2
*/

public class _8_14 {

	public static void main(String[] args) 
	{
		Pond var1 = new Bay();
		Object var2 = new Ocean();
		
		((Lake) var1).method1(); //Prints Bay 1 Pond 2
		System.out.println();
		((Bay) var1).method1(); //Prints Bay 1 Pond 2
		System.out.println();
		((Pond) var2).method2(); //Ocean 2
		System.out.println();
		((Lake) var2).method2(); //Ocean 2
		System.out.println();
		((Ocean) var2).method3(); //Lake 3 Ocean 2
	}

}