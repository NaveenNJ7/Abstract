package University;

public class Student extends Department{

	
	@Override
	void dep(String dname)
	{
		super.coll("BEC");  //coll() is concrete method
		System.out.println("Department name :"+dname);
	}
	
	@Override
	void std(String sname)
	{
		// this.dep("Mechanical");
		System.out.println("Student name :"+sname);
	}
	
	void std(int id)
	{
		// this.std("Navin");
		System.out.println("Student id :"+id);
	}
	
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.dep("Mechanical");
		s.std("Naveen");
		s.std(57); 
		
	//	s.std(57);
	}
	
	
	
	
	
	
	
	
	
	
}
