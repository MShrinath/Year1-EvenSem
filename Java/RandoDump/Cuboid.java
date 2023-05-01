package classroom;

import java.util.*;

public class Cuboid {

    double l, b, h;

    Cuboid(double a, double b, double c) {
        this.l = a;
        this.b = b;
        this.h = c;
    }

    void vol() {
        System.out.println(l * b * h);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        sc.close();

        Cuboid c1 = new Cuboid(x, y, z);
        // Cuboid c2 = new Cuboid(4, 5, 6);
        c1.vol();
        // c2.vol();

    }
}
