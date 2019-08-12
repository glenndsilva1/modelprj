package modelprj.test1;

public class CapsCar implements Car{
    private Car car;
    
    CapsCar(Car car){
    	this.car = car;
    }
	
	public String name() {
		return this.car.name();
	}

	
	public String model() {
		return this.car.model();
	}
	
	public String toString() {
		  return this.name().toUpperCase() + " " + this.model().toUpperCase();
	}
}
