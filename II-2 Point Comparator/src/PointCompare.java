import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;

public class PointCompare 
{

	public static void main(String[] args) 
	{
		ArrayList<Point> pointList = new ArrayList<Point>();
		pointList.add(new Point(0, 1));
		pointList.add(new Point(2, 5));
		pointList.add(new Point(3, 3));
		pointList.add(new Point(4, 1));
		pointList.add(new Point(2, 2));
		Collections.sort(pointList, new PointComparator());
		for (int c = 0; c < pointList.size(); c++)
		{
			Point point = pointList.get(c);
			System.out.println("(" + point.x + ", " + point.y + ")");
		}
	}
}
