package javacore;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	
	public Customer(int id, String firstName, String lastName, String gender, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	} 
	
	public long getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Customer ID: " + id + " First Name: " + firstName + " Last Name: "
				+ lastName + " Gender: " + gender + " Age: " + age;
	}

}
