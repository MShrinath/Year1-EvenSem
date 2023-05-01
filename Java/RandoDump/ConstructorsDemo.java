package classroom;

public class ConstructorsDemo {	
	int x,y;
	ConstructorsDemo(int a){
		this(10,a);
		x=a+100;
		y=y+1;
	}
	ConstructorsDemo(int a,int b){
		x=a+300;
		y=b;
//		System.out.println(x+" "+y);
	}
	public String toString() {
		return x+" "+y;
	}
	public static void main(String[] args) {
		ConstructorsDemo cd1 = new ConstructorsDemo(1);
		ConstructorsDemo cd2 = new ConstructorsDemo(10);
		System.out.println();
		System.out.println(cd1);
		System.out.println(cd2);
		}
}
