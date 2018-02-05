/*
Name: Ethan Duer
Project Name: 11-2 Point Comparator
File Name: 
PointCompare.java
PointComparator.java
Purpose: To create a comparator for a point object, with points closer to the origin considered to come before
Pseudocode: Creates a list of points, and sorts it using Collections.sort, and uses PointComparator as a comparator.
Point comparator finds the distances from the origin of two points, and uses Object.compareTo to compare them.
Maintenance Log:
2/4/18: Project created
*/

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;

public class PointCompare 
{

	public static void main(String[] args) 
	{
		ArrayList<Point> pointList = new ArrayList<Point>();
		pointList.add(new Point(2, 5));
		pointList.add(new Point(4, 1));
		pointList.add(new Point(0, 1));
		pointList.add(new Point(2, 2));
		pointList.add(new Point(3, 3));
		Collections.sort(pointList, new PointComparator());
		for (int c = 0; c < pointList.size(); c++)
		{
			Point point = pointList.get(c);
			System.out.println("(" + point.x + ", " + point.y + ")");
		}
	}
}
