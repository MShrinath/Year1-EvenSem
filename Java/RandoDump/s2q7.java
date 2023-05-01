package pocket;

import java.util.*;

public class s2q7 {
    public static void main(String[] args) {
        ArrayList<toy> k = new ArrayList<toy>();
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
                System.out.println("1.Add toy\n2.Price > 1000");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        System.out.println("Enter ID");
                        int i = sc.nextInt();
                        System.out.println("Enter Name");
                        String n = sc.next();
                        System.out.println("Enter Price");
                        double p = sc.nextDouble();
                        toy j = new toy(i, n, p);
                        k.add(j);
                        break;
                    
                    case 2:
                        for(toy e : k){
                            // if(e.getprice() > 1000)
                                System.out.println(e);
                        }
                        break;
                    default:
                        break;
                }
            }
        }
    }
}

class toy{
    private int ID;
    private String Name;
    private double Price;

    public toy(int id,String name,double price){
        this.ID = id;
        this.Name = name;
        this.Price = price;
    }

    double getprice(){
        return Price;
    }

    public String toString(){
        return ID + " " + Name + " " + Price  + "\n";
    }
}
