package modelprj.test1;

public class CarDTO implements Car {
	String name;
	String model;

	CarDTO(String name, String model){
		   this.name = name;
		   this.model = model;
	}
	
	public String name() {
		return this.name;
	}

	public String model() {
		return this.model;
	}
	
	public String toString() {
		  return this.name() + " " + this.model();
	}
	
	public static void main(String args[]) {
		     Car car = new CapsCar(new CarDTO("bmw","a1"));
		        
		        System.out.println(car.name());
		        System.out.println(car.model());
		        System.out.println(car.toString());
	}
}
