package testcars;

public class MarketPrice implements Price{
      Car car;
	
	public MarketPrice(MongoCar mongoCar) {
		 this.car = mongoCar;
	}

	@Override
	public Double value() {
		// TODO Auto-generated method stub
		return new Double(10d);
	}

	@Override
	public String currency() {
		// TODO Auto-generated method stub
		return "USD";
	}

}
