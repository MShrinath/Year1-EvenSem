package classroom;

class watch{
    int x;
    watch(int y){
        this.x=y;
    }
}

public class phone {
    public static void main(String[] args) {
        singleton khm1 = singleton.giveOk();
        singleton khm2 = singleton.giveOk();
        System.out.println(khm1);
        System.out.println(khm2);
    }
    
}
