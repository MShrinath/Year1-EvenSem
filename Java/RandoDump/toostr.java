package pocket;

public class toostr {
    int x = 10;
    double y = 1.00;
    char z;

    void setz(char z) {
        this.z = z;
    }
    public String toString() {
        return x + " " + y + " " + z;
    }
    public static void main(String[] args) {
        toostr s = new toostr();
        s.setz('S');
        System.out.println(s);
    }
}