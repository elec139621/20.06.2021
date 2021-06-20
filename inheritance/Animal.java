package proj4;

public class Animal {

	protected String m_name;
	protected float m_height;
	// add age
	
	public Animal(String m_name, float m_height) {
		super();
		this.m_name = m_name;
		this.m_height = m_height;
		// add age + getter/setter
	}

	public float getM_height() {
		return m_height;
	}

	public void setM_height(float m_height) {
		this.m_height = m_height;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	@Override
	public String toString() {
		return "Animal [m_name=" + m_name + ", m_height=" + m_height + "]";
		// add age
	}
	
	
}
