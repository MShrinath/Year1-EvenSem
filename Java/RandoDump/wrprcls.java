package classroom;

//Java program to convert primitive into objects  
//Autoboxing example of int to Integer  
public class wrprcls {
    public static void main(String args[]) {
        // Converting int into Integer
        int a = 20;
        Integer i = Integer.valueOf(a);// converting int into Integer explicitly
        Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(a + " " + i + " " + j);
    }
}

class wrprcls2 {
    public static void main(String args[]) {
        // // Converting Integer to int
        // Integer a = new Integer(3);
        // int i = a.intValue();// converting Integer to int explicitly
        // int j = a;// unboxing, now compiler will write a.intValue() internally
        // System.out.println(a + " " + i + " " + j);
    }
}