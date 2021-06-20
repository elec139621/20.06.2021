package proj3;

public class Circle {

	private double m_radius;
	private double m_pie; // add it to ctor , add it to string
	// create 3 circles radius: 0.755, 4.99, 80.5
	// println all 3
	// *etgar: create list of 3 circles
	//         each circle will have a random radius
	
	public Circle(double radius) {
		m_radius = radius;
	}
	
	public double getRadius() {
		return m_radius;
	}
	
	public void setRadius(double newRadius) {
		if (newRadius > 0) {
			m_radius = newRadius;
		}
	}
	
	@Override
	public String toString() {
		return "".format("Cirlce radius: %f", m_radius);
	}
	
}
