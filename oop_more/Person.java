package proj3;

import java.time.LocalDateTime;

public class Person {

	private final int m_id;
	private String m_name;
	private String m_address;
	private LocalDateTime m_birth;
	
	public Person(int id, String name, String address) {
		m_id = id;
		m_name = name;
		m_address = address;
		//m_time = Now;
	}
	
	public void setId(int new_id) {
		//m_id = new_id;
	}
	
	// getters
	// setters
	
	@Override
	public String toString() {
		return "".format("Person %d %s %s", m_id, m_name, m_address);
	}
	
}
