package file;

public class Vehicle {
	
	int wheel ;
	int seeter;
	int mileage;
	int topSpeed;
	String brandName;

	public Vehicle (String brandString,int wheeler,int seeter){
		this.wheel = wheeler;
		this.seeter = seeter;
		this.brandName = brandString;
	}

	
	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public int getSeeter() {
		return seeter;
	}

	public void setSeeter(int seeter) {
		this.seeter = seeter;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}