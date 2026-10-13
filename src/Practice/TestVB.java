package Practice;

public class TestVB extends Bike {

	@Override
	void start()
	{
		System.out.println("Bike started");
	}
	
	@Override
	void stop()
	{
		System.out.println("Bike stopped");
	}
	public static void main(String[] args) {
		
		TestVB t  = new TestVB();
		t.start();
		t.gear();
		t.stop();
		
	/*
	  here vehicle and bike both are abstract class
	  TestVB extends bike, bike extends vehicle, so should override both start and stop 
	*/
		
	}
}
