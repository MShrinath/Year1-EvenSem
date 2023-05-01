package classroom;

import java.util.*;

public class arrylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
            a.add(sc.nextInt());
        sc.close(); 
        

        System.out.println(a);
        a.remove(2);

        Collections.sort(a);
        System.out.println(a);
    }
}
