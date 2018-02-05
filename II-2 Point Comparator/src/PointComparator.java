import java.awt.Point;
import java.util.Comparator;

public class PointComparator implements Comparator<Point>
{
	@Override
	public int compare(Point point1, Point point2) 
	{
		return ((Double)distanceFromOrigin(point1)).compareTo(distanceFromOrigin(point2));
	}
	
	private double distanceFromOrigin(Point point)
	{
		double x = point.getX();
		double y = point.getY();
		return Math.sqrt(x * x + y * y);
	}
}
