package myPack;
import java.util.*;
public class MyStudent {

	private String name;
	private int phone_num;
	private int roll_num;
	private int class_num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(int phone_num) {
		this.phone_num = phone_num;
	}
	public int getRoll_num() {
		return roll_num;
	}
	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}
	public int getClass_num() {
		return class_num;
	}
	public void setClass_num(int class_num) {
		this.class_num = class_num;
	}
	public String toString()
	{
		return name+""+phone_num+""+roll_num+""+class_num;
	}

	public void result(String name, int phone_num,int roll_num,int class_num)
	{
		
		Scanner digi= new Scanner(System.in);
		System.out.println("Enter the marks of physics");
		int physics=digi.nextInt();
		System.out.println();
		System.out.println("Enter the marks of chemistry");
		int chemistry=digi.nextInt();
		System.out.println();
		System.out.println("Enter the marks of maths");
		int maths=digi.nextInt();
		if ((physics+chemistry+maths)/3>30)
		{
			System.out.println("Student is pass");
		}
		else
		{
			System.out.println("Student is fail");
		}
	}
	
}
