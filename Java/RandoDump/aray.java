package classroom;

import java.util.*;

public class aray {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a[] = new int[5];
		
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		
		s.close();
		
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
	}
}