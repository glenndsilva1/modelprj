package modelprj.test1;

import javax.json.Json;
import javax.json.JsonObjectBuilder;

public class JsonCar implements Car {
    final Car car;
    
	
	JsonCar(Car car){
		 this.car = car;
		// this(car,Json.createObjectBuilder());
	}
	
	JsonCar(Car car, JsonObjectBuilder jsonb){
		   this.car = car;
		   
	}
	
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String model() {
		// TODO Auto-generated method stub
		return null;
	}
	
	class JsonBuild{
		 JsonBuild(){
			 
		 }
	}
	

}
