package pocket;
//overriding
//same method name same parameters
class A{
	void m(){
		System.out.println("Method from class A");
	}	
}
class B extends A{
	void m(){//same parameters
		System.out.println("Method from class B");
	}
	//this method OVERRIDES the previous method definition 
}
public class ovrrding {
	public static void main(String[] args) {
		A aobj = new A();
		aobj.m();
		
		B bobj = new B();
		bobj.m();//class b object calling method
	}
}
