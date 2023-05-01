package classroom;

class acc{
	private double bal=22000;
	private int accid=32644;
	double getbal(){
		return bal;
	}
	int getaccid(){
		return accid;
	}
	void setbal(double x){
		bal+=x;
	}
}
public class idk {
	public static void main(String[] args) {
		acc a=new acc();
		System.out.println(a.getbal());
	}

    public void add() {
    }
}
