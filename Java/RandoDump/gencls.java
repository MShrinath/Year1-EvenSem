package classroom;

public class gencls<DT> {
    private DT val;

    public void add(DT x) {
        // Assuming T is a numeric data type
        this.val = x;
    }
    
    public DT getValue() {
        return this.val;
    }
    public static void main(String[] args) {
        gencls<Integer> obj = new gencls<Integer>();
        obj.add(10  );
        System.out.println(obj.getValue());
    }
}
