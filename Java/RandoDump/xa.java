package classroom;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class xa{
    FileReader fr = null;
    FileWriter fw = null;
    public static void main(String[] args) {

        try{
            FileReader fr = new FileReader("rxa.txt");
            FileWriter fw = new FileWriter("wxa.txt");
            int c;
            while((c = fr.read()) != -1){
                fw.write(c);
            }
            fr.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}