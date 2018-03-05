/*
Name: Ethan Duer
Project Name: 13-3 Self-Check
Filename: 
_10.java
Flute.java
Blue.java
Shoe.java
Moo.java
Purpose: Testing inheritance
Pseudocode: Create a bunch of classes, and test their methods 
Maintenance log:
3/1/18: Project created
*/
public class _I0 {
	public static void main(String[] args) {
		Moo[] elements = {new Blue(), new Moo(), new Shoe(), new Flute()};
		for (int i = 0; i < elements.length; i++)
		{
			elements[i].method2();
			elements[i].method1();
			System.out.println(elements[i]);
			System.out.println();
		}
	}
}
