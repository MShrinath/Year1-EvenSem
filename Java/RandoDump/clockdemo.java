package classroom;

class WrongTime extends Exception{
    WrongTime(String s){
        super(s);
    }
}

public class clockdemo{
    public static void main(String[] args) throws WrongTime {
        clock c = new clock();
        c.sethh(0);
        c.setmm(0);
        c.setss(0);
        System.out.println(c);
    }
}

class clock {
    
    private int hh;
    private int mm;
    private int ss;

    void sethh(int h)throws WrongTime{
        if(0 <= h && h <= 23)
            this.hh=h;
        else
            throw new WrongTime("Wront input");
    }

    int gethh(){ 
        return hh;
    }

    void setmm(int m)throws WrongTime{
        if(0 <= m && m <=59)
            this.mm=m;
        else
            throw new WrongTime("Wront input");
    }

    int getmm(){
        return mm;
    }

    void setss(int s)throws WrongTime{
        if(0 <= s && s <=59)
            this.ss=s;
        else
           throw new WrongTime("Wront input");
    }

    int gets(){
        return ss;
    }

    public String toString(){
        return hh + " hours " + mm + " minutes " + ss + " seconds\n";
    }

}


