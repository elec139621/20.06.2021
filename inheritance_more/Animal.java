package proj4;

public abstract class Animal {

	protected String m_name;
	protected float m_height;
	protected int m_age; 
	
	public Animal(String m_name, float m_height, int m_age) {
		this.m_name = m_name;
		this.m_height = m_height;
		this.m_age = m_age;
	}
	
	public int getM_age() {
		return m_age;
	}

	public void setM_age(int m_age) {
		this.m_age = m_age;
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
		return "Animal [m_name=" + m_name + ", m_height=" + m_height + ", m_age=" + m_age + "]";
	}


	
}
