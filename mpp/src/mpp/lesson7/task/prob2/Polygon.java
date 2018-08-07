package mpp.lesson7.task.prob2;

public interface Polygon extends ClosedCurve {
	double[] getSides();

	default public double computePerimeter() {
		double perimeter = 0;
		for (double side : getSides())
			perimeter += side;
		return perimeter;
	}
}
