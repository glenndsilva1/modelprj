package testcars;

import java.util.Iterator;

public interface Cars {
	  public Iterator<Car> iterator();
	  public Cars filter(final String price);//Constant implements Price and always returns the same value.

	  
}
