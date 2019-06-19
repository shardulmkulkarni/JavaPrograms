package tayari;


interface BaseI { void method(); }

class BaseC {

	public void method() {
	
		System.out.println("inside basec::method");
	
		
		
	}
}

class ImpC extends BaseC implements BaseI{ 
	
	public static void main(String args[]) {
	
		(new ImpC()).method();
		
	}

}


//Compile time error

// CICD - no active contribution, only theory
// Java - not good
// TestNG - no DP
