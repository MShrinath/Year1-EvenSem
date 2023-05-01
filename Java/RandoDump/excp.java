package classroom;

public class excp {

    public static void main(String[] args) {
        
        try {
        int a = 10;
        int b = 0;
        int c = a/b; // divide by 0 error
        System.out.println("Result: " + c);
        } 
        
        catch (Exception e) { 
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block");
        }
        
    }
}
