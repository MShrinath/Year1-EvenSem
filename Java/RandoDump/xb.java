package classroom;

import java.util.Scanner;

public class xb extends Exception{

    static long n;
    public xb(String s){
        super(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter number");
            n = sc.nextLong();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            int c=0;
            while(n>0){
                n = n/10;
                c++;
            }
            if(c!=10){
                try{
                    throw new xb("Number should be 10 digits");
                }
                catch(xb e){
                    System.out.println(e);
                }
            }
            else{
                System.out.println("Number is 10 digits");
            }
            sc.close();
        }
        
    }
}
