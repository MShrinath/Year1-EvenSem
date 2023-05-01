package pocket;

import java.util.Scanner;

public class s2q1 {
	public static void main(String[] args) {
		Dis d = new Dis();
		
		System.out.println(d.discount());
	}

}

class Dis {

	public  double discount() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter price");
		double price = s.nextDouble();
		System.out.println("Enter the discount %");
		double dis = s.nextDouble();
		s.close();
		double dp = (dis / 100) * price;
		return price - dp;

	}

}