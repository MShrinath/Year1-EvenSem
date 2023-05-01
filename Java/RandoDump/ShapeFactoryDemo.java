package classroom;

interface Shape{
    void draw();
}

class Circle implements Shape{
    public void draw(){
        System.out.println("Draw Circle");
    }
}

class Square implements Shape{
    public void draw(){
        System.out.println("Draw Square");
    }
}

abstract class ShapeDecor implements Shape{

    protected Shape refs;

    ShapeDecor(Shape refs){
        this.refs=refs;
    }
    public void draw(){
        refs.draw();
    }
}

class RedShapeDecor extends ShapeDecor{
    RedShapeDecor(Shape refs){
        super(refs); 
        setborder();
    }

    public void setborder(){
        System.out.println("This shape border is red");
    }
}

public class ShapeFactoryDemo {
    public static void main(String[] args) { 
        Shape rc = new RedShapeDecor(new Circle());
        rc.draw();
    }
}