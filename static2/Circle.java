package proj3;

public class Circle {

	private double m_radius;
	private static final double m_pie = 3.14; // add it to ctor , add it to string
	// create 3 circles radius: 0.755, 4.99, 80.5
	// println all 3
	// *etgar: create list of 3 circles
	//         each circle will have a random radius
	
	public Circle(double radius) {
		m_radius = radius;
	}
	
	public static double getPie() {
		return m_pie;
	}
	
	/*
	public static void setPie(double newPie) {
		if (newPie > 0) {
			m_pie = newPie;
		}
	}
	*/
	
	public double getRadius() {
		return m_radius;
	}
	
	public void setRadius(double newRadius) {
		if (newRadius > 0) {
			m_radius = newRadius;
		}
		//m_pie++;
	}
	
	@Override
	public String toString() {
		return "".format("Cirlce radius: %f pie: %f", m_radius, m_pie);
	}
	
}
