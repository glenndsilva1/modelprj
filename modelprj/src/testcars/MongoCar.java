package testcars;

public class MongoCar implements Car {
	

public Price price() {
    return new MarketPrice(this);
  }
}