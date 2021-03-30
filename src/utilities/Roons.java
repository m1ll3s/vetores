package utilities;

public class Roons {
	
	
	public String name;
	public String email;
	public double room;
	
	public Roons(String name, String email) {
		this.name = name;
		this.email = email;
	}
	private String getName() {
		return name;
	}
	private String getEmail() {
		return email;
	}
	private double getRoom() {
		return room;
	}
	
	
	private void setName(String name) {
		this.name = name;
	}
	private void setEmail(String email) {
		this.email = email;
	}
	private void setRoom(double room) {
		this.room = room;
	}
	
	
	public String toString() {
		
		return name +","+ email;
	}
	
	
}
