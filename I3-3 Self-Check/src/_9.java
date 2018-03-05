/*
Name: Ethan Duer
Project Name: 13-3 Self-Check
Filename: 
_9.java
Flute.java
Blue.java
Shoe.java
Moo.java
Purpose: Testing inheritance
Pseudocode: Create a bunch of classes, and test their methods 
Maintenance log:
3/1/18: Project created
*/
public class _9 {
	public static void main(String[] args) {
		Moo[] elements = {new Shoe(), new Flute(), new Moo(), new Blue()};
		for (int i = 0; i < elements.length; i++)
		{
			System.out.println(elements[i]);
			elements[i].method1();
			elements[i].method2();
			System.out.println();
		}
	}
}
