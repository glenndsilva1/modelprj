package testcars;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FilteredCars implements Cars {
	Cars cars;
	String price;
	
	FilteredCars(Cars cars, String price){
		this.cars = cars; 
		this.price = price;
	}

	@Override
	public Iterator<Car> iterator() {
		     Iterator <Car> c1 = cars.iterator();
		     while(c1.hasNext()) {
		      }
		     return cars.iterator();
	}

	@Override
	public Cars filter(String price) {
		// TODO Auto-generated method stub
		//Iterator  <Car>  c1 = this.iterator();
		return  cars;
	}
	
	public static void main(String args[]) {
		final Cars cars =  new MongoCars();

		Cars cheaper = cars.filter("10") ;
		
		
		
		
		
		
		

	}
	
}
