package classroom;

public class outerinner {

	public static void main(String[] args) {
		outer out = new outer();
		outer.inner in = out.new inner();
		in.b();
	}

}

class outer {

	void a() {
		System.out.println("Out a");
	}

	class inner {
		void b() {
			System.out.println("In b");
		}

	}
}