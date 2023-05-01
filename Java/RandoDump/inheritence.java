package classroom;

class a{
    void a1(){
        System.out.println("a1");
    }

    void a2(){
        System.out.println("a2");
    }

}

class b extends a{

    void b1(){
        System.out.println("b1");
    }

}


public class inheritence {

    public static void main(String[] args) {
        b k =new b();
        k.b1();
        k.a1();
    }
    
}
