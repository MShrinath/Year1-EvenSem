package classroom;

abstract class hm{
    abstract void hi();
    void k(){
        System.out.println("k");
    }
}

class kkk extends hm{
    void hi(){
        System.out.println("hiiikk");
    }
}

public class abtractDemo {
    public static void main(String[] args) {
        hm h = new hm(){
            void hi(){
                System.out.println("hi");
            }
        };
        h.hi();
        h.k();

        kkk f = new kkk();
        f.hi();
        f.k();
    }
    
}
