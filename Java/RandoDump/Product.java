package classroom;

public class Product {

    private int id,quantity,price;
    private String name;

    Product(){
        this.id=0;
        this.quantity=0;
        this.price=0;
        this.name=null;
    }

    void setid(int x){
        this.id=x;
    }

    void setquantity(int x){
        this.quantity=x;
    }

    void setprice(int x){
        this.price=x;
    }

    void setname(String x){
        this.name=x;
    }

    int getid(){
        return id;
    }

    int getquantity(){
        return quantity;
    }

    int getprice(){
        return price;
    }

    String getname(){
        return name;
    }

    public String toString(){
        return "Name: " + name + "\nId: " + id + "\nPrice: " + price + "\nQuantity: " + quantity;
    }
}
