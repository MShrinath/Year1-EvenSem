package classroom;

import java.util.*;

class Student123 {

	private String Name;
	private double ID;
	private String Gender;
	private double Number;
	private String Department;
	private int S1;
	private int S2;
	private int S3;

	public void setName(String s) {
		Name = s;
	}

	String getName() {
		return Name;
	}

	void setID(double iD2) {
		ID = iD2;
	}

	double getID() {
		return ID;
	}

	public void setGender(String G) {
		Gender = G;
	}

	String getGender() {
		return Gender;
	}

	public void setNumber(double n) {
		Number = n;
	}

	double getNumber() {
		return Number;
	}

	public void setDepartment(String d) {
		Department = d;
	}

	String getDepartment() {
		return Department;
	}

	void setS1(int sub) {
		S1 = sub;
	}

	int getS1() {
		return S1;
	}

	void setS2(int sub2) {
		S2 = sub2;
	}

	int getS2() {
		return S2;
	}

	void setS3(int sub3) {
		S3 = sub3;
	}

	int getS3() {
		return S3;
	}

	public int Percentage() {
		return (S1 + S2 + S3) * 100 / 3;
	}

	public void dispLay_details() {
		System.out.println(Name);
		System.out.println(ID);
		System.out.println(Gender);
		System.out.println(Number);
		System.out.println(Department);
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
	}

}

public class ali {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Nae;
		System.out.println("Enter Your Name");
		Nae = sc.nextLine();
		Student123 i = new Student123();
		i.setName(Nae);
		System.out.println(i.getName());

		double ID;
		System.out.println("Enter Your Number");
		ID = sc.nextDouble();
		i.setID(ID);
		System.out.println(i.getID());

		String Gender;
		System.out.println("Enter Your Gender");
		Gender = sc.nextLine();
		i.setGender(Gender);
		System.out.println(i.getGender());

		double Number;
		System.out.println("Enter Your Mobile Number");
		Number = sc.nextDouble();
		i.setNumber(Number);
		System.out.println(i.getNumber());

		String Department;
		System.out.println("Enter Your Department");
		Department = sc.nextLine();
		i.setDepartment(Department);
		System.out.println(i.getDepartment());

		int S1;
		System.out.println("Enter your Subject1 marks");
		S1 = sc.nextInt();
		i.setS1(S1);
		System.out.println(i.getS1());

		int S2;
		System.out.println("Enter your Subject2 marks");
		S2 = sc.nextInt();
		i.setS2(S2);
		System.out.println(i.getS2());

		int S3;
		System.out.println("Enter your Subject3 marks");
		S3 = sc.nextInt();
		i.setS3(S3);
		System.out.println(i.getS3());

		System.out.println("Your Total Percentage is:" + i.Percentage());
		sc.close();
	}
}
