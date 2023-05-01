package classroom;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


public class files {
	public static void main(String[] args) throws IOException {
		FileWriter h=new FileWriter("f.txt");
		String s="India is my country";
		h.write(s);
		h.close();
		FileInputStream p=new FileInputStream("f.txt");
		FileOutputStream k=new FileOutputStream("f.txt");
		// int i;
		// while(i=(p.read()!= -1 ))
		//     k.write((char)i);
		p.close();
		k.close();
	}
}