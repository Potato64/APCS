/*
Name: Ethan Duer
Project Name: 13-3 Self-Check
Filename: 
_8.java
A.java
B.java
C.java
D.java
Purpose: Testing inheritance
Pseudocode: Create a bunch of classes, and test their methods 
Maintenance log:
3/1/18: Project created
*/
public class _8 {

	public static void main(String[] args) 
	{
		A[] elements = {new B(), new D(), new A(), new C()};
		for (int i = 0; i < elements.length; i++)
		{
			elements[i].method2();
			System.out.println(elements[i]);
			elements[i].method1();
			System.out.println();
		}
	}

}
