/*
Name: Ethan Duer
Project Name: 13-3 Self-Check
Filename: 
_13.java
Bay.java
Lake.java
Ocean.java
Pond.java
Mammal.java
SeaCreature.java
Whale.java
Squid.java
Purpose: Testing inheritance
Pseudocode: Create a bunch of classes, and test their methods 
Maintenance log:
3/1/18: Project created
*/

public class _I3 {
	public static void main (String[] args)
	{
		Pond[] ponds = {new Ocean(), new Pond(), new Lake(), new Bay()};
		for (Pond p : ponds)
		{
			p.method1();
			System.out.println();
			p.method2();
			System.out.println();
			p.method3();
			System.out.println("\n");
		}
	}
}
