package classroom;

class singleton {
    private singleton(){}
    public static singleton s;

    public static singleton giveOk(){
        if(s==null){
            s =new singleton();
        }
        return s;
    }
    void print(){
        System.out.println("Hello");
    }
    
}