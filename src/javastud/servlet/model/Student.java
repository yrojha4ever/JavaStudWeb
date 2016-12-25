package javastud.servlet.model;

public class Student {
	private int id;
	private String name;
	private String address;
	private String gender;
	private String country;
	
	public Student(){
	}

	public Student(int id, String name, String address, String gender, String country) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", gender=" + gender + ", country="
				+ country + "]";
	}
	
	
}
