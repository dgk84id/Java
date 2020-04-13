package test;

public class car {
	int doors;
	int wheels;
	void doorcount(int a,float b,char c,String g)
	{
		doors=4;
	}
	void doorcount()
	{
		
	}
	void wheelscount()
	{
		wheels=4;
	}
	public static void main(String[] args) {
		car bmw= new car();
		car tata=new car();
		bmw.doorcount();
		tata.doorcount();
		
		
	}

}
