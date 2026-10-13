package com;

public class Theroy {

	/*
	 
	 Abstract - 
	   
	  1) is a pre defined key word, which can be used with Class and methods
	  2) if a class is declared with abstract keyword then it is called abstract class
	  3) abstract class accept both concrete methods and abstract methods
	  4) if a class not declared with abstract keyword then it is called as concrete class
	  5) concrete class accept only concrete methods
	  6) concrete methods will have both declaration and implementations or definitions
	     access specifier retruntype method name()
	     {
	       implementations
	     }
	     
	  7) abstract methods will have only declaration no implementations
	     syantax  -  access specifier  abstract returntype method name();
	                 public abstract void m();
	     
	  8) all abstracts methods will be declared using abstract keyword     
	  
	   
	  Contract of abstract or what should we do when class extends or inherits abstract class
	  or 
	  Can a class inherits an abstract class? ----- Yes but we have to follow either of the 
	  rules which are
	  
	  1) when a class inherits abstract class, override all the abstract methods
	  2) if we do not want to override inherited abstract methods, then make subclass as abstract class
	  
	  Note - 
	  1) we can not create an object of abstract class
	     bcoz abstract methods will not have implementations, suppose after creating an object 
	     if we call that method, what will execute there will be no implementations,
	     abstract class is incomplete class
	     
	  2) Abstract methods can not be private
	     In abstract class if we have abstract method, the main intention of having that method is
	     override it later. if we make it private method, the method can access only within that class. 
	     we can not access that method outside the class.
	     
	  3) abstract methods can not be final
	     final methods can not be overridden, thats the reason abstract methods can not be final
	     
	  4) abstract methods can not be static
	     static belongs to the class therefore abstract methods can not be static
	     
	  5) Can Abstract class have constructors -  Yes we can have
	  
	  
	      we can not invoke it directly, indirectly we can call it. it has to be invoked by the 
	      subclass constructor by implicitly or explicitly using super keyword
	      
	     when we create an object of class if that class has super class(abstract class)
	     and if that super class have non parameterized constructor and the sub class will 
	     call that constructor implicitly
	     
	     when we create an object of class(sub class) if that class has super class(abstract class)
	     and if that super class have parameterized constructor and the sub class will call that 
	     constructor explicitly using super keyword.
	      
	  6) consider a abstract class which has abstract method, and one sub class(concrete class) 
	     inherits that abstract class, but concrete class does not allow abstract methods so the subclass  
	     must declares as abstract class or override the abstract methods(which are in abstract class).
	                
	        
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 */
}
