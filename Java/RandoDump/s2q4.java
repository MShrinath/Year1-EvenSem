package pocket;

public class s2q4 {
    public static void main(String[] args) {
        // cityd[] c = new cityd[3];

    }
}

class cityd{

    private String city;
    private int latitude;
    private int longitude;

    void setCity(String city){
        this.city = city;
    }

    void setLatitude(int lat){
        if(-90 < lat && lat < 90)
            this.latitude = lat;
    }

    void setLongitude(int lng){
        if(-180 < lng && lng < 180)
            this.longitude = lng;
    }

    public String toString(){
        return city + "\n" + latitude + "\n" + longitude;
    }
}