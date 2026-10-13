package Practice;

public class Son extends Father {

	@Override
	void bike()
	{
		System.out.println("Modified bike");
	}
	
	public static void main(String[] args) {
		
		Son s = new Son();
		s.bike();
	}
	
	
}
