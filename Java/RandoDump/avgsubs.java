package classroom;

import java.util.Scanner;

public class avgsubs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float m,p,c,e,s;
		System.out.print("Enter maths");
		m= sc.nextFloat();
		System.out.print("Enter phy");
		p= sc.nextFloat();
		System.out.print("Enter chem");
		c= sc.nextFloat();
		System.out.print("Enter eng");
		e= sc.nextFloat();
		System.out.print("Enter sanskrit");
		s= sc.nextFloat();
		
		float tot;
		tot=m+p+c+e+s;
		System.out.println("Avg is "+tot/5);
		sc.close();
	}

}
