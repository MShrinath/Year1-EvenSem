package pocket;

class InvalidDataExcp extends Exception{

    InvalidDataExcp(String s){
        super(s);
    }
}

public class s2q11 {
    public static void main(String[] args) throws InvalidDataExcp {
        student s = new student();
        s.setName("Sahitya");
        s.setWeight(118);
        s.setHeight(1.3);
        System.out.println(s);
    }
}

class student{
    private String name;
    private double height;
    private double weight;

    void setHeight(double h) throws InvalidDataExcp{
        if(1.0 <= h && h <= 1.8)
            this.height = h;
        else{
            throw new InvalidDataExcp("Wrong Height");
        }
    }

    void setWeight(double w) throws InvalidDataExcp{
        if(20 <= w && w <= 120)    
            this.weight = w;
        else
            throw new InvalidDataExcp("Wrong Weight");
    }

    void setName(String n){
        this.name = n;
    }

    public String toString(){
        return name + " " + height + " " + weight + "\n";
    }
}
