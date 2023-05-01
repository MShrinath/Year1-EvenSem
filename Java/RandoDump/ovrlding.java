package pocket;
//overloading 
//same method name but different parameters
//different parameters call different methods
class AA{
	void a() {
		System.out.println("No parameters");
	}
	void a(int x) {
		System.out.println("1 parameter " + x);
	}
	void a(int x,int y) {
		System.out.println("2 parameters " + x + " " + y);
	}
}

public class ovrlding {
	public static void main(String[] args) {
		AA aobj = new AA();
		aobj.a();
		aobj.a(10);
		aobj.a(10,20);
	}

}

