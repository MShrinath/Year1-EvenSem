package pocket;

import java.util.Scanner;

public class oo {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
			a[i]=s.nextInt();
		
		s.close();
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}	
}
	

