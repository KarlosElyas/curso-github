package entities;

public class StudentRoom {
	private String name, email;

	public StudentRoom(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public String toString() {
		return name + ", " + email;
	}
}
