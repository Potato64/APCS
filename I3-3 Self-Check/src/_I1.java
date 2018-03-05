/*
Name: Ethan Duer
Project Name: 13-3 Self-Check
Filename: 
_11.java
Mammal.java
SeaCreature.java
Whale.java
Squid.java
Purpose: Testing inheritance
Pseudocode: Create a bunch of classes, and test their methods 
Maintenance log:
3/1/18: Project created
*/

public class _I1 {
	public static void main(String[] args)
	{
		SeaCreature[] elements = {new Squid(), new Whale(), new SeaCreature(), new Mammal()};
		for (int i = 0; i < elements.length; i++)
		{
			System.out.println(elements[i]);
			elements[i].method1();
			elements[i].method2();
			System.out.println();
		}
	}
}
