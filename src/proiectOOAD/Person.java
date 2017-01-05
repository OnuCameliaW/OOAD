package proiectOOAD;

public class Person {
	public int personId;
	public String firstName;
	public String lastName;
	public float phoneNumber;
	public String email;
	public String skype;
	
	public Person(int personId, String firstName, String lastName, float phoneNumber, String email, String skype) {
		super();
		this.personId = personId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.skype = skype;
	}

	
	
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
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

	public float getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(float phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}
	
	
	
	
	
}
