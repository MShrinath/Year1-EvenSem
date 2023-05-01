package classroom;

public class ProductDemo {
    public static void main(String[] args) {
        Product p1=new Product();
        System.out.println(p1);
        p1.setid(10);
        p1.setname("Ramen");
        System.out.println(p1);
    }
}