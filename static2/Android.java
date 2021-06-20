package proj3;

import java.time.LocalDateTime;

public class Android {

	// constant value of m_vendor_name = "Android"
	public static final String VEDNOR = "Android";

	// static value of m_latest_android_version = 11.4
	private static float m_latest_android_version = 11.4f; 

	// getter setter
	public static float get_latest_android_version() {
		return m_latest_android_version;
	}

	public static void set_latest_android_version(float latest_android_version) {
		if (latest_android_version > 0) {
			Android.m_latest_android_version = latest_android_version;
		}
	}
	
	private final LocalDateTime m_produced_time; 
	
	private float m_device_android_version;
	
	public float get_device_android_version() {
		return m_device_android_version;
	}

	public void set_device_android_version(float m_device_android_version) {
		this.m_device_android_version = m_device_android_version;
	}

	// private String m_model + getter/setter
	private String m_model;
	public String get_model() {
		return m_model;
	}

	public void set_model(String m_model) {
		this.m_model = m_model;
	}

	// private double m_price + getter/setter
	private double m_price;
	public double get_price() {
		return m_price;
	}

	public void set_price(double m_price) {
		this.m_price = m_price;
	}

	public Android(String m_model, double m_price) {
		// read-only field of phone_creation_time = LocalDateTime.now()
		this.m_produced_time = LocalDateTime.now();
		this.m_model = m_model;
		this.m_price = m_price;
		m_device_android_version = m_latest_android_version;
	}

	@Override
	public String toString() {
		return "Android [m_produced_time=" + m_produced_time + ""
				+ ", m_model=" + m_model + ", m_price=" + m_price + "]";
	}
	

	

	
}
