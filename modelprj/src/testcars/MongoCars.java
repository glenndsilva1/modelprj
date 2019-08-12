package testcars;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MongoCars implements Cars {
	public Iterator<Car> iterator() {
	    //return a simple iterator; Maybe read the Car objects into a List and return its iterator.
		// TODO Auto-generated method stub
				List<Car> car = new ArrayList<Car>();
				car.add(new MongoCar());
				car.add(new MongoCar());
				return car.iterator();
	  }

	  /**
	   * Filter these cars according to a constant Price.
	   */
	  @Override
	  public Cars filter(final String price) {//Constant implements Price and always returns the same value.
	    return new FilteredCars(this, price);
	  }
}
