package javaPackage;

public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.setterId(1100);
		System.out.println(obj.getterId());
	}

}




class Student 
{
	private int id;
	
	void setterId (int a)
	{
		id =a;
	}
	
	int getterId ()
	{
		return id;
	}
	
	}