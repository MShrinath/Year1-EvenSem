package classroom;

import java.util.Scanner;

public class mmm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int min,max,sum;
		min=max=sum=a[0];
		for(int i=1;i<a.length;i++){
			if(a[i]<min){
				min=a[i];
			}
			if(a[i]>max){
				max=a[i];	
			}
			sum+=a[i];
		}
		System.out.println("Min = "+min);
		System.out.println("Max = "+max);
		System.out.println("Avg = "+sum/a.length);
		sc.close();
	}
}
