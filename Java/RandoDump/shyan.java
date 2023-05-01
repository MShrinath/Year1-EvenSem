package classroom;

public class shyan {
    // private String name;
    private int phno;

    void setno(int n) {
        phno = n;
    }

    int getno() {
        return phno;
    }

    static void area(int l, int b) {
        System.out.println(l * b);
    }

    static void area(int a) {
        System.out.println(a * a);
    }

    static void area() {
        System.out.println("AREA");
    }

    public static void main(String[] args) {
        area();
        area(4);
        area(2, 3);
    }
}
