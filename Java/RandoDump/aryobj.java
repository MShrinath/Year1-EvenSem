package classroom;

public class aryobj {
    int a, b;

    aryobj(int x) {
        this(x, x + 10);
        a = x;
    }

    aryobj(int x, int y) {
        this.a = x;
        this.b = y;
    }

    public String toString() {
        return a + " " + b;
    }

    public static void main(String[] args) {
        aryobj a[] = new aryobj[5];

        for (int i = 0; i < a.length; i++)
            a[i] = new aryobj(i, 20);

        for (aryobj i : a)
            System.out.println(i);
    }
}
