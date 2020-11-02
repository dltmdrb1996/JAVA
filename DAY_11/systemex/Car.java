package systemex;

public class Car {
	String model;
	String owner;
	
	public Car(String model) {
		this.model = model;
	}
	
	public Car(String model , String owner) {
		this.model =model;
		this.owner = owner;
	}
	
	
	String getModel() {
		return model;
	}
	String getOwner() {
		return owner;
	}
	void setModel(String model) {
		this.model=model;
	}
	void setOwner(String owner) {
		this.owner=owner;
	}
}
